package com.yq.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yq.news.api.QueryService;
import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.service.CategoryQueryService;
import com.yq.news.service.NewsQueryService;

@RestController
public class NewsQueryController2 implements QueryService{
	@Autowired
	private NewsQueryService newQueryService;
	
	@Autowired
	private CategoryQueryService cateQueryService;
	
	@Override
	public List<News> getNewsList() {
		
		return this.newQueryService.getNewsList();
	}

	@Override
	public List<Category> getCategoryList() {
		
		return this.cateQueryService.getCategoryList();
	}
	
	
}
