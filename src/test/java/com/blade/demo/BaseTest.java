package com.blade.demo;

import com.blade.demo.domain.entity.User;
import com.blade.test.BladeApplication;
import com.blade.test.BladeTestRunner;
import org.junit.runner.RunWith;

import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import io.github.biezhi.anima.Anima;
import static io.github.biezhi.anima.Anima.delete;

@RunWith (BladeTestRunner.class)
@BladeApplication(Application.class)
@Slf4j
public abstract class BaseTest {

    @BeforeClass
    public static void before() {
        //h2();
        //initData();
        System.out.println();
        System.out.println("============== Start Test Code ==============");
        System.out.println();
    }

    protected static void initData() {
        new User("jack", 25).save();
        new User("rose", 23).save();
        new User("tom", 24).save();
        new User("biezhi", 8).save();
        new User("lilei", 19).save();
        new User("john", 38).save();
        new User("king", 32).save();
    }
    
    protected static void h2() {
    
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:h2:file:~/demo;FILE_LOCK=FS;PAGE_SIZE=1024;CACHE_SIZE=8192");
        ds.setUsername("sa");
        ds.setPassword("");
    
        Sql2o sql2o = Anima.open(ds).getSql2o();
    
        //Sql2o sql2o = Anima.open("jdbc:h2:file:~/demo;FILE_LOCK=FS;PAGE_SIZE=1024;CACHE_SIZE=8192", "sa", "").getSql2o();
    
        String sql = "DROP TABLE IF EXISTS `users`;\n" +
                "CREATE TABLE `users` (" +
                "`id` IDENTITY PRIMARY KEY, " +
                "`user_name` varchar(50) NOT NULL, " +
                "`age` int(11)," +
                ");" +
                "DROP TABLE IF EXISTS `order_info`;\n" +
                "CREATE TABLE `order_info` (" +
                "`id` IDENTITY PRIMARY KEY," +
                "`uid` int(11) NOT NULL," +
                "`productname` varchar(100) NOT NULL," +
                "`create_time` datetime NOT NULL" +
                ");" +
                "DROP TABLE IF EXISTS `addresses`;\n" +
                "CREATE TABLE `addresses` (" +
                "`order_id` bigint(20) PRIMARY KEY," +
                "`city` varchar(100) NOT NULL," +
                "`street` varchar(200) NOT NULL" +
                ");" +
                "DROP TABLE IF EXISTS `persons`;\n" +
                "CREATE TABLE `persons` (" +
                "`name` varchar(50) PRIMARY KEY," +
                "`sex` varchar(10) NOT NULL," +
                "`vip_level` int(4) NOT NULL" +
                ");";
    
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).executeUpdate();
        }
    }

}


