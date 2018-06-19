package com.multimodule.test.service;

import org.springframework.stereotype.Service;

import com.multimodule.test.dto.TestDto.DemoDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
// @Transactional
public class TestService {

  public DemoDto postTest(DemoDto demoDto) {
    System.out.println("TEST: " + demoDto.getValue());
    return demoDto;
  }

  public String getTest(String value) {
    System.out.println("TEST: " + value);
    return value;
  }

}
