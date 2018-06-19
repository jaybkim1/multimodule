package com.multimodule.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multimodule.test.dto.TestDto.DemoDto;
import com.multimodule.test.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
  @Autowired TestService testService;

  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public DemoDto postTest(@RequestBody DemoDto demoDto) {
    return testService.postTest(demoDto);
  }

  @RequestMapping(value = "/get/{value}", method = RequestMethod.GET)
  public String getTest(@PathVariable String value) {
    return testService.getTest(value);
  }

}
