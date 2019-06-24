package com.yq.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yq.news.mapper.NewsMapper;
import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
import com.yq.news.pojo.NewsExample;
import com.yq.news.pojo.PageResult;


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

	@Override
	public News findNewsById(int id) {
		
		return this.newsMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public PageResult findPage(Integer pageNum,Integer pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);

		NewsExample example = new NewsExample();

		// List<News> list = this.newsMapper.selectByExample(example);
		Page<News> page = (Page<News>) this.newsMapper.selectByExample(example);

		// 返回自定义的封装结果

		PageResult pageResult = new PageResult();
		pageResult.setTotal(page.getTotal()); // 总记录数
		pageResult.setRows(page.getResult()); // // 查询的区间数据
		return pageResult;
	}

}
