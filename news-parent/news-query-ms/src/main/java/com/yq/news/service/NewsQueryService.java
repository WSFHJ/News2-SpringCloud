package com.yq.news.service;

import java.util.List;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;

public interface NewsQueryService {

	
	public List<News> getNewsList();
	
	
	public News getNewsById(Integer id);
	
	
}
