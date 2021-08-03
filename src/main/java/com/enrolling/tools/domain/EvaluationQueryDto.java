package com.enrolling.tools.domain;

import lombok.Data;

@Data
public class EvaluationQueryDto {
    private String id;
    private int examNumber;
    private String examName;
    private String examLabel;
    private boolean examStatus;
    private int bizType;


}
