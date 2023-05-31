package com.luxoft.urlshortener.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shortened_urls")
public class ShortenedURL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    private Date creation = new Date();
    @Getter
    @Setter
    private String email;
    @Getter
    private String target;
    @Getter
    @Setter
    private String shortenedCode;
    @Getter
    @Setter
    private boolean active = true;

    public ShortenedURL(String email, String target, String shortenedCode) {
        this.creation = creation;
        this.email = email;
        this.target = target;
        this.shortenedCode = shortenedCode;
    }

    public ShortenedURL(String email, String target) {
        this.creation = creation;
        this.email = email;
        this.target = target;
    }
}