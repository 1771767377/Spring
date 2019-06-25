package controller.redis;

import redis.clients.jedis.Jedis;

public class Main {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.98.15",6379,1000);
        System.out.println("连接成功");
        System.out.println("服务正在运行"+jedis.ping());


    }

}
