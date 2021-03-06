package com.dp.live.service.impl;

import com.dp.live.mapper.UploadMapper;
import com.dp.live.service.UploadService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Resource
    private UploadMapper uploadMapper;


    @Override
    public String upload(String multipartFile) {

        return uploadMapper.upload(multipartFile);
    }
}
