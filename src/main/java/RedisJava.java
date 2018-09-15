import redis.clients.jedis.Jedis;

/**
 * 参考 https://www.runoob.com/redis/redis-java.html
 */
public class RedisJava {
    public static void main(String[] args) {

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        //设置 redis 字符串数据
        jedis.set("runTest", "interesting");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runTest"));
    }
}