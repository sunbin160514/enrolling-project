package com.enrolling.tools.service.impl;

import com.enrolling.tools.common.Result;
import com.enrolling.tools.remote.EvaluationApi;
import com.enrolling.tools.request.ExamQueryReq;
import com.enrolling.tools.response.EvaluationQueryRes;
import com.enrolling.tools.response.ExamQueryRes;
import com.enrolling.tools.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EvaluationServiceImpl implements EvaluationService {
    @Autowired
    private EvaluationApi evaluationApi;

    public List<EvaluationQueryRes> queryByParams(ExamQueryReq req) {
        Result<ExamQueryRes> rs = evaluationApi.examQuery("e68f730cb39d45878894e6d3c00aebaa", req);
        if (null != rs.getData()) {
            return rs.getData().getExamListDtoList();
        }


    }
}
