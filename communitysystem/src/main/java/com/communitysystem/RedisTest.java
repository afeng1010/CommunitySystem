package com.communitysystem;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/xwj")
public class RedisTest {

    @GetMapping("redisTest")
    public void redisTest(@RequestParam int k) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("117.48.209.221",8888);
        System.out.println("连接成功");
        //设置 redis 字符串数据
        for (int i = k;i<k+100;i++){
            //jedis.set("runoobkey"+i,String.valueOf(i));
            System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"+i));
        }
        // 获取存储的数据并输出

    }

    @GetMapping("redisTest1")
    public void redisTest1(@RequestParam int k) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("117.48.209.221",8889);
        System.out.println("连接成功");
        //设置 redis 字符串数据
        for (int i = k;i<k+100;i++){
            //jedis.set("runoobkey"+i,String.valueOf(i));
            System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"+i));
        }
        // 获取存储的数据并输出

    }
}
