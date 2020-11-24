package com.masterchef.estaurant.utils;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

public class URIUtil {
    public static URI generateUrl(String id){
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }
}
