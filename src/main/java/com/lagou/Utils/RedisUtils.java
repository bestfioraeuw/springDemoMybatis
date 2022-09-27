package com.lagou.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Huw_Lin
 * time: 2022-09-27 14:48
 */

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    public Object get(final String key){
        return  redisTemplate.opsForValue().get(key);
    }

    //写入缓存
    public  boolean set(String key ,Object value){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,value,1, TimeUnit.DAYS);
            result =true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 更新缓存
     */
    public boolean getAndSet(final String key, String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除缓存
     */
    public boolean delete(final String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
