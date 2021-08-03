package com.enrolling.tools.response;

import lombok.Data;

@Data
public class EvaluationQueryRes {
    private String id;
    private int examNumber;
    private String examName;
    private String examLabel;
    private boolean examStatus;
    private int bizType;
}
