package com.enrolling.tools.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -4745703790022338793L;
    private String code;
    private String message;
    private boolean showMessage;
    private String showMessageApp;
    private T data;


}