package com.yq.news.service;

import com.yq.news.pojo.News;

public interface NewsEditService {

	public void addNews(News news);
	
	public void updateNews(News news);

	public void delNews(Integer[] ids);
	
}
