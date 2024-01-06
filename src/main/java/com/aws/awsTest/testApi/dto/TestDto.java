package com.aws.awsTest.testApi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class TestDto {

    private Long testId;
    private String content;
}
