package com.yq.news.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.yq.news.api.QueryService;

@FeignClient(value="news-query-ms")
public interface FeginNewsService extends QueryService{	
}
