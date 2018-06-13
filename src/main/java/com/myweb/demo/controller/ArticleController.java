package com.myweb.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myweb.demo.domain.Article;
import com.myweb.demo.service.ArticleService;

@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/article/submit", method = RequestMethod.POST)
	public String submitArticle(Article article){
		System.out.println(article.getArticleContent());
		return article.getArticleContent();
	}
}
