package com.yq.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.service.FeginNewsService;

@Controller
public class NewsFeignController {
	@Autowired
	private FeginNewsService feginService;
	@RequestMapping(value="/getNewsList")
	public ModelAndView getNewsList()
	{
		ModelAndView mv = new ModelAndView();
		 List<News> newsList = this.feginService.getNewsList();
		 
		 List<Category> categoryList = this.feginService.getCategoryList();
		 mv.addObject("categoryList", categoryList);
		 mv.addObject("newsList", newsList);
		 mv.setViewName("newslist");
		 return mv;
	}
	
}
