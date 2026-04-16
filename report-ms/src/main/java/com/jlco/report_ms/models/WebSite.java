package com.jlco.report_ms.models;


import lombok.Data;

import java.io.Serializable;

@Data // create setters, constructor, equals
public class WebSite implements Serializable {

    private Long id;
    private String name;
    private Category category;
    private String description;

}
