package com.yq.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yq.news.pojo.News;
import com.yq.news.service.NewsQueryService;

@RestController
public class NewsQueryController {
	@Autowired
	private NewsQueryService newsQueryService;
	@RequestMapping(value="/getNewsList")
	public List<News> getNewsList()
	{
	  return this.newsQueryService.getNewsList();
	}
	
	
}
