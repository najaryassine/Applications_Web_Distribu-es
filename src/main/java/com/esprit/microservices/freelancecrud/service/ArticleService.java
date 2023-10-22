package com.esprit.microservices.freelancecrud.service;

import com.esprit.microservices.freelancecrud.model.Article;
import com.esprit.microservices.freelancecrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {


    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article updateArticle(Long id, Article updatedArticle) {
        if (articleRepository.existsById(id)) {
            updatedArticle.setId(id);
            return articleRepository.save(updatedArticle);
        }
        return null; // Handle not found case
    }

    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

}

