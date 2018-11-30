package com.nemo.sj.gencode.controller;

import com.nemo.sj.gencode.service.CodeService;
import com.nemo.sj.gencode.utils.DateUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@RestController
public class GenCodeController {

    @Autowired
    CodeService codeService;


    @GetMapping
    public void t(HttpServletRequest request, HttpServletResponse response) throws IOException {
        byte[] data = codeService.generatorCode(new String[]{"yb_user"});
//        response.reset();
//        response.setHeader("Content-Disposition", "attachment; filename=\"AutoCode"
//                + DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN_YYYY_MM_DD_HH_MM_SS_SSS) + ".zip\"");
//        response.addHeader("Content-Length", "" + data.length);
//        response.setContentType("application/octet-stream; charset=UTF-8");
        File file = new File("code.zip");
        FileUtils.writeByteArrayToFile(file, data,false);

    }
}
