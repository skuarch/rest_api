package rest_api.rest_api.model.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponse> illegalArgumentException(IllegalArgumentException iae) {    
        ExceptionResponse er = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(), iae.getMessage());
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }
    
}
