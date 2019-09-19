package com.dp.live.utils;

import lombok.Data;

/**
 * 结果工具类
 * @author Administrator
 * @param <T>
 */
@Data
public class Result<T> {

    private int status;
    private String msg;
    private T data;

    /**
     * 正确时返回的数据
     * @param obj
     * @return
     */
    public static Result success(Object obj) {
        Result result = new Result();
        result.setData(obj);
        result.setMsg("success");
        result.setStatus(200);
        return result;
    }

    /**
     * 错误时返回的数据
     * @return
     */
    public static Result error() {
        Result result = new Result();
        result.setMsg("error");
        result.setStatus(404);
        return result;
    }
}
