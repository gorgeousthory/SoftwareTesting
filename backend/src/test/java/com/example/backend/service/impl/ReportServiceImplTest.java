package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.common.Result;
import com.example.backend.entity.Report;
import com.example.backend.service.ReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
public class ReportServiceImplTest {

    @Resource
    public ReportService reportService;
    @Test
    public void getReportList() {
        String state;
        String target_type;
        String sortBYTime;
        Map<String,Object> reportList;
        //用例1:
        state="2";
        target_type="0";
        sortBYTime="asc";
        reportList = reportService.getReportList(state,target_type,sortBYTime);
        System.out.printf('\n'+"根据"+"state:" + state+"target_type:"+target_type+"sortByTime:"+sortBYTime + "查找到的reportList信息：" +reportList+'\n');
        //用例2:
        state="2";
        target_type="1";
        sortBYTime="asc";
        reportList = reportService.getReportList(state,target_type,sortBYTime);
        System.out.printf('\n'+"根据"+"state:" + state+"target_type:"+target_type+"sortByTime:"+sortBYTime + "查找到的reportList信息：" +reportList+'\n');
        //用例3:
        state="2";
        target_type="2";
        sortBYTime="asc";
        reportList = reportService.getReportList(state,target_type,sortBYTime);
        System.out.printf('\n'+"根据"+"state:" + state+"target_type:"+target_type+"sortByTime:"+sortBYTime + "查找到的reportList信息：" +reportList+'\n');

    }
}