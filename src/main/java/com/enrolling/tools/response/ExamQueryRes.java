package com.enrolling.tools.response;

import lombok.Data;

import java.util.List;

@Data
public class ExamQueryRes {

    private int count;
    private List<EvaluationQueryRes> examListDtoList;

//    @Data
//    public static class ExamListDtoListBean {
//        private String id;
//        private int examNumber;
//        private String examName;
//        private String examLabel;
//        private boolean examStatus;
//        private int examStatusEnum;
//        private int createPaperMethod;
//        private String userName;
//        private long editTime;
//        private int bizType;


//    }
}
