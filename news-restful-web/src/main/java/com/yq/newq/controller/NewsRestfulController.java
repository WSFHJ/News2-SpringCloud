package com.yq.newq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;

@Controller
public class NewsRestfulController {
	
	private final String NEWS_LIST = "http://localhost:8899/news-query/getNewsList";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/getNewsList")
	public ModelAndView getNewsList()
	{
		ModelAndView mv = new ModelAndView();
		
		
		//System.out.println("111111"+this.restTemplate.getForObject(NEWS_LIST,List.class));
 
		
		List<News> newsList = this.restTemplate.getForObject(NEWS_LIST, List.class);
		
		
		//restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());

		 /*List<News> newsList = this.feginService.getNewsList();
		 
		 List<Category> categoryList = this.feginService.getCategoryList();
		 mv.addObject("categoryList", categoryList);
		 
		 
		 
		 */
		mv.addObject("newsList", newsList);
		 mv.setViewName("newslist");
		 return mv;
	}
	
}
