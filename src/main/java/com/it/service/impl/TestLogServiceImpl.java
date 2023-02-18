package com.it.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.mapper.TestLogMapper;
import com.it.pojo.TestLog;
import com.it.service.TestLogService;
import org.springframework.stereotype.Service;

@Service
public class TestLogServiceImpl extends ServiceImpl<TestLogMapper, TestLog> implements TestLogService {
}
