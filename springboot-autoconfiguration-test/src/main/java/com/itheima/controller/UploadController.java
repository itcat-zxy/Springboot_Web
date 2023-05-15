package com.itheima.controller;

import com.aliyun.oss.AliOSSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public String upload(MultipartFile image) throws Exception {
        //上传文件到阿里云 OSS （要想使用 阿里云OSS,还需要在配置文件中 配置 AliOSSProperties的参数信息  ）
        String url = aliOSSUtils.upload(image);
        return url;
    }

}
