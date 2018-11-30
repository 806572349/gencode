package com.nemo.sj.gencode.init;

import com.nemo.sj.gencode.dao.SysGeneratorDao;
import com.nemo.sj.gencode.utils.Constant;
import com.nemo.sj.gencode.utils.GenUtils;
import lombok.AllArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@AllArgsConstructor
@Component
public class Appinit   implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {


    }


}
