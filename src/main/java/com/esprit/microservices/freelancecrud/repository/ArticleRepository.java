package com.esprit.microservices.freelancecrud.repository;

import com.esprit.microservices.freelancecrud.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // You can add custom query methods here if needed
}
