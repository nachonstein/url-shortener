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
@Table(name = "events")
public class URLEventEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    private Long urlId;
    @Getter
    @Setter
    private Date timestamp;
    @Getter
    @Setter
    private EventType type;
    @Getter
    @Setter
    private String description;

    public enum EventType{
        URL_CREATED,
        URL_DISABLED,
        URL_MODIFIED
    }
}
