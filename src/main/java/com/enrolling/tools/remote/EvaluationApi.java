package com.enrolling.tools.remote;


import com.enrolling.tools.common.Result;
import com.enrolling.tools.request.ExamQueryReq;
import com.enrolling.tools.response.ExamQueryRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "evaluation", url = "https://evaluation-beta.speiyou.com")
public interface EvaluationApi {
    /**
     *
     */
    @PostMapping(value = "/web/exam/query")
    Result<ExamQueryRes> examQuery(@RequestHeader("token") String token, @RequestBody ExamQueryReq req);
}
