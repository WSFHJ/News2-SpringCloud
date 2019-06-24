package com.yq.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.news.mapper.NewsMapper;
import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.pojo.NewsExample;


@Service
public class NewsQueryServiceImpl implements NewsQueryService {

	
	@Autowired
	private NewsMapper newsMapper;
	
	
	@Override
	public List<News> getNewsList() {
		
		
		NewsExample example = new NewsExample();
		
		List<News> list = this.newsMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public News getNewsById(Integer id) {
		
		return this.newsMapper.selectByPrimaryKey(id);
	}

}
