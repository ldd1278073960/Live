package com.dp.live.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface UploadMapper {

    /**
     * 文件上传
     * @param multipartFile
     * @return
     */
    String upload( @Param("multipartFile") String multipartFile);

}
