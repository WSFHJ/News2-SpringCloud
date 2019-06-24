package com.yq.news.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yq.news.api.EditService;
import com.yq.news.pojo.News;
import com.yq.news.pojo.Result;
import com.yq.news.service.NewsEditService;
@RestController
public class NewsEditController implements EditService{
	@Autowired
	private NewsEditService newsService;
	@Override
	public Result addNews(@RequestBody News news) {
	//	System.out.println(news.getTitle());
		Result result = new Result();
		try {
			news.setCreatedate(new Date());
			this.newsService.addNews(news);
			result.setSuccess(true);
		} catch (Exception e) {
			result.setSuccess(false);
			e.printStackTrace();
		}
		//System.out.println(result.isSuccess());
		return result;
	}


	
	@Override
	public Result updateNews(@RequestBody News news) {
		//System.out.println(news.getTitle());
		Result result = new Result();
		try {
			this.newsService.updateNews(news);
			result.setSuccess(true);
		} catch (Exception e) {
			result.setSuccess(false);
			e.printStackTrace();
		}
		System.out.println(result.isSuccess());
		return result;
	}

	@Override
	public Result delNews(Integer[] ids) {
		System.out.println(ids[0]);
		Result result = new Result();
		try {
			newsService.delNews(ids);
			result.setSuccess(true);
		} catch (Exception e) {
			result.setSuccess(false);
			e.printStackTrace();
		}
		System.out.println(result.isSuccess());
		return result;
	}

}
