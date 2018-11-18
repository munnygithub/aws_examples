package com.aws.dynamodb.model;

import java.util.List;
import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {

	Optional<ProductInfo> findById(String id);
}