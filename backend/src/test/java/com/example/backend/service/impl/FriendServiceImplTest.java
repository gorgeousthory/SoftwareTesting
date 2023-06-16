package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.common.Result;
import com.example.backend.service.FriendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
public class FriendServiceImplTest {

    @Resource
    public FriendService friendService;
    @Test
    public void addFriend() {
        Long userid;
        Long friendid;
        Result<String> friends;
        //用例1:
        userid = Long.parseLong("1147");
        friendid = Long.parseLong("1148");
        friends = friendService.addFriend(userid,friendid);
        System.out.printf("根据id" + userid + "查找到的friends信息：" + friends);
        //用例2:
        userid = Long.parseLong("1148");
        friendid = Long.parseLong("1147");
        friends = friendService.addFriend(userid,friendid);
        System.out.printf("根据id" + userid + "查找到的friends信息：" + friends);
        //用例3:
        userid = Long.parseLong("1147");
        friendid = Long.parseLong("1149");
        friends = friendService.addFriend(userid,friendid);
        System.out.printf("根据id" + userid + "查找到的friends信息：" + friends);
        //用例4:
        userid = Long.parseLong("1147");
        friendid = Long.parseLong("1150");
        friends = friendService.addFriend(userid,friendid);
        System.out.printf("根据id" + userid + "查找到的friends信息：" + friends);
        //用例5:
        userid = Long.parseLong("1147");
        friendid = Long.parseLong("1150");
        friends = friendService.addFriend(userid,friendid);
        System.out.printf("根据id" + userid + "查找到的friends信息：" + friends);
    }
}