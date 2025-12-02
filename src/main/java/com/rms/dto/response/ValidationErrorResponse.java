package com.rms.dto.apiValidationErrorResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ValidationErrorResponse {
    private boolean success;
    private int status;
    private String message;
    private Map<String, String> validationErrors;
}
