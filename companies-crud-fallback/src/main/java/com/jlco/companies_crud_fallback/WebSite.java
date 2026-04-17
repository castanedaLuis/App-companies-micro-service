package com.jlco.companies_crud_fallback;


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
