package com.aws.awsTest.testApi.controller;

import com.aws.awsTest.testApi.dto.TestDto;
import com.aws.awsTest.testApi.entity.TestEntity;
import com.aws.awsTest.testApi.mapper.TestMapper;
import com.aws.awsTest.testApi.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
@Slf4j
public class TestController {

    private final TestService testService;

    // 모든 데이터 조회
    @GetMapping("/all")
    public List<TestDto> getAllTestdatas() {
        List<TestEntity> testEntityList = testService.getAllTestdatas();
        log.info(String.valueOf(testEntityList.size()));

        // Entity to Dto
        List<TestDto> testDtoList = new ArrayList<>();
        for (TestEntity testEntity : testEntityList) {
            TestDto testDto = TestMapper.mapper.toDto(testEntity);
            testDtoList.add(testDto);
        }

        return testDtoList;
    }
}
