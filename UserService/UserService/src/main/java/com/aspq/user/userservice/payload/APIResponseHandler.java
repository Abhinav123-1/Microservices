package com.aspq.user.userservice.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponseHandler {
    private String message;
    private boolean success;
    private HttpStatus status;
}
