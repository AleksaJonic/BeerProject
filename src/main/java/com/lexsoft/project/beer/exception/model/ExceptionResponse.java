package com.lexsoft.project.beer.exception.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    Long timestamp;
    String cid;
    List<ErrorMessage> errors;

}
