package com.example.ProjectLaptopStore.Exception;
import org.modelmapper.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(RuntimeException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(SQLException.class)
    public String sqlException(SQLException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(ValidationException.class)
    public String validationException(ValidationException ex) {
        return ex.getMessage();
    }
    // Có thể thêm nhiều phương thức xử lý ngoại lệ khác theo nhu cầu
}
