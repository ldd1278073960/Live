package com.dp.live.controller;

import com.dp.live.service.UploadService;
import com.dp.live.utils.Result;
import com.dp.live.utils.UploadUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author Administrator
 * 文件上传
 */
@RestController
@Slf4j
public class UploadController {

    @Resource
    private UploadService uploadService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public Result uploadSingFile(@RequestParam("img")MultipartFile multipartFile){
        try{
            String saveImage = UploadUtils.saveImage(multipartFile);
            String upload = uploadService.upload(saveImage);
            return Result.success(upload);
        } catch (IOException e) {
            log.error(e.getMessage());
            return Result.error();
        }

    }
}
