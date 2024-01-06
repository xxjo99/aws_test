package com.aws.awsTest.testApi.service;

import com.aws.awsTest.testApi.entity.TestEntity;
import com.aws.awsTest.testApi.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestRepository testRepository;

    // 모든 데이터 조회
    public List<TestEntity> getAllTestdatas() {
        return testRepository.findAll();
    }
}
