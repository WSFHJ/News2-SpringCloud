package com.yq.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yq.news.mapper.NewsMapper;
import com.yq.news.pojo.News;


@Transactional
@Service
public class NewsEditServiceImpl implements NewsEditService {

	
	@Autowired
	private NewsMapper newsMapper;
	
	@Override
	public void addNews(News news) {
		
		newsMapper.insert(news);	

	}

	@Override
	public void updateNews(News news) {
		
		this.newsMapper.updateByPrimaryKey(news);

	}

	@Override
	public void delNews(Integer[] ids) {
		for (Integer id : ids) {
			this.newsMapper.deleteByPrimaryKey(id);
		}

	}

}
