package com.yq.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.news.mapper.CategoryMapper;
import com.yq.news.pojo.Category;
import com.yq.news.pojo.CategoryExample;

@Service
public class CategoryQueryServiceImpl implements CategoryQueryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getCategoryList() {
		
		CategoryExample example = new CategoryExample();
		return this.categoryMapper.selectByExample(example);
	}

}
