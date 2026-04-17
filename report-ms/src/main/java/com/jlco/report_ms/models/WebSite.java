package com.jlco.report_ms.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data // create setters, constructor, equals
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebSite implements Serializable {
    private String name;
}
