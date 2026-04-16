package com.jlco.report_ms.models;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data // create setters, constructor, equals
public class WebSite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(columnDefinition = "category")
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private String description;

}
