package com.enrolling.tools.service;

import com.enrolling.tools.request.ExamQueryReq;
import com.enrolling.tools.response.EvaluationQueryRes;

import java.util.List;

public interface EvaluationService {

    List<EvaluationQueryRes> queryByParams(ExamQueryReq req);
}
