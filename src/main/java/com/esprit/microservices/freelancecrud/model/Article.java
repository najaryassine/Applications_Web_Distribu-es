package com.esprit.microservices.freelancecrud.model;

import javax.persistence.*;

@Entity
public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;
        private String category;
        private String content;

        // Constructors, getters, and setters

        public Article() {
            // Default constructor
        }

        public Article(String title, String category, String content) {
            this.title = title;
            this.category = category;
            this.content = content;
        }

        // Getters and setters for id, title, category, and content

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

}
