package com.ycc.aicodemother.controller;

import com.ycc.aicodemother.common.BaseResponse;
import com.ycc.aicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HealthController
 * @author: ycl
 * @date: 2026/02/26 17:02:38
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/check")
    public BaseResponse<String> check() {
        return ResultUtils.success("ok");
    }
}
