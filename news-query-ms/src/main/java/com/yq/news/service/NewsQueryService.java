package com.yq.news.service;

import java.util.List;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.pojo.PageResult;

public interface NewsQueryService {

	
	public List<News> getNewsList();
	
	
	public News getNewsById(Integer id);
	
	
	public News findNewsById(int id);
	
	
	public PageResult findPage(Integer pageNum,Integer pageSize);
	
}
