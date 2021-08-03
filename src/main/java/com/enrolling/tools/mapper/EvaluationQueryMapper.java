package com.enrolling.tools.mapper;

import com.enrolling.tools.domain.EvaluationQueryDto;
import com.enrolling.tools.request.ExamQueryReq;

import java.util.List;

public interface EvaluationQueryMapper {
    List<EvaluationQueryDto> queryByParams(ExamQueryReq req);
}
