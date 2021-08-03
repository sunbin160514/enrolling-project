package com.enrolling.tools.request;
import lombok.Data;

@Data
public class ExamQueryReq {
    private int pageNumber;
    private int pageSize;
    private String cityCode;
    private String year;
    private String gradeId;
    private String termId;
    private String subjectId;
    private String examStatusEnum;
    private String midifier;


}

