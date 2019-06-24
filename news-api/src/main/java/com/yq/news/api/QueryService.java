package com.yq.news.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.pojo.PageResult;

public interface QueryService {
	@RequestMapping(value="/getNewsList",method=RequestMethod.GET)
	public List<News>getNewsList();
	@RequestMapping(value="/getCategoryList",method=RequestMethod.GET)
	public List<Category>getCategoryList();
	
	
	@RequestMapping(value="/findNewsById/{id}",method=RequestMethod.GET)
	public News findNewsById(@PathVariable int id);
	
	
	@RequestMapping("/findPage")
	public PageResult findPage(Integer pageNum,Integer pageSize);

	
}
