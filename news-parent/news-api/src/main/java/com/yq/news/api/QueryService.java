package com.yq.news.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;

public interface QueryService {
	@RequestMapping(value="/getNewsList",method=RequestMethod.GET)
	public List<News>getNewsList();
	@RequestMapping(value="/getCategoryList",method=RequestMethod.GET)
	public List<Category>getCategoryList();
	
	
}
