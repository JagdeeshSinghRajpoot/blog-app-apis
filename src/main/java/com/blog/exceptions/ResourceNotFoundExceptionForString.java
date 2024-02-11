package com.blog.exceptions;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResourceNotFoundExceptionForString extends RuntimeException {




        String resourceName;
        String fieldName;
        String fieldValue;
        public ResourceNotFoundExceptionForString(String resourceName, String fieldName, String fieldValue) {
            super(String.format("%s not ford with %s : %s",resourceName, fieldName, fieldValue));
            this.resourceName = resourceName;
            this.fieldName = fieldName;
            this.fieldValue = fieldValue;
        }
}
