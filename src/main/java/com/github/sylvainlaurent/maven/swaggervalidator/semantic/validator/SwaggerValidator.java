package com.github.sylvainlaurent.maven.swaggervalidator.semantic.validator;

import com.github.sylvainlaurent.maven.swaggervalidator.semantic.validator.error.SemanticError;

import java.util.List;

public interface SwaggerValidator {
    List<SemanticError> getErrors();
    void setValidationContext(ValidationContext context);
}
