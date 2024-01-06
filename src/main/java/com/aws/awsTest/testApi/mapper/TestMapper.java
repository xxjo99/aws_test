package com.aws.awsTest.testApi.mapper;

import com.aws.awsTest.mapper.EntityMapper;
import com.aws.awsTest.testApi.dto.TestDto;
import com.aws.awsTest.testApi.entity.TestEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestMapper extends EntityMapper<TestDto, TestEntity> {

    TestMapper mapper = Mappers.getMapper(TestMapper.class);
}
