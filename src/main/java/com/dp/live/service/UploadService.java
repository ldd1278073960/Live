package com.dp.live.service;


/**
 * @author Administrator
 */
public interface UploadService {

    /**
     * 文件上传
     * @param multipartFile
     * @return
     */
    String upload(String multipartFile);

}
