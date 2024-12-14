package com.aspq.user.userservice.exceptions;

import com.aspq.user.userservice.payload.APIResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Centralised Exception handler
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class) //Anywhere this Exception Occurs this will be executed.
    public ResponseEntity<APIResponseHandler> handleResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        APIResponseHandler response = APIResponseHandler.builder().
                message(message).
                success(true).
                status(HttpStatus.NOT_FOUND).
                build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
