package com.esprit.microservices.freelancecrud.controller;

import com.esprit.microservices.freelancecrud.model.Article;
import com.esprit.microservices.freelancecrud.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleRestAPI {


        private final ArticleService articleService;

        @Autowired
        public ArticleRestAPI(ArticleService articleService) {
            this.articleService = articleService;
        }

        @GetMapping
        public List<Article> getAllArticles() {
            return articleService.getAllArticles();
        }

        @GetMapping("/{id}")
        public Optional<Article> getArticle(@PathVariable Long id) {
            return articleService.getArticleById(id);
        }

        @PostMapping(value = "/add")
        public Article createArticle(@RequestBody Article article) {
            return articleService.createArticle(article);
        }

        @PutMapping("/{id}")
        public Article updateArticle(@PathVariable Long id, @RequestBody Article updatedArticle) {
            return articleService.updateArticle(id, updatedArticle);
        }

        @DeleteMapping("/{id}")
        public void deleteArticle(@PathVariable Long id) {
            articleService.deleteArticle(id);
        }
    }


