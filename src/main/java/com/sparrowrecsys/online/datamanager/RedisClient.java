package com.sparrowrecsys.online.datamanager;

import redis.clients.jedis.Jedis;

public class RedisClient {
    //singleton Jedis
    private static volatile Jedis redisClient;
    final static String REDIS_END_POINT = "10.200.85.12";
    final static int REDIS_PORT = 6379;

    private RedisClient(){
        redisClient = new Jedis(REDIS_END_POINT, REDIS_PORT, 100000);
        redisClient.auth("6192699redis");
    }

    public static Jedis getInstance(){
        if (null == redisClient){
            synchronized (RedisClient.class){
                if (null == redisClient){
                    redisClient = new Jedis(REDIS_END_POINT, REDIS_PORT, 100000);
                    redisClient.auth("6192699redis");
                }
            }
        }
        return redisClient;
    }
}
