# XConomyAPI 

如何通过Maven添加API  
How to add the API with Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.YiC200333</groupId>
        <artifactId>XConomyAPI</artifactId>
        <version>2.17.2</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

如何通过Gradle添加API  
How to add the API with Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.YiC200333:XConomyAPI:2.17.2"
}
```

**如何通过API接口获取/修改数据**  
**How to get / modify data through API**

>[XConomyAPI](https://github.com/YiC200333/XConomyAPI/blob/master/XConomyAPI.md)



**如何监听转账事件**  
**How to listen to transfer events**   

For XConomy V2.11.5 (API for Bukkit Plugins)
```java
package com.example.plugin;

import me.yic.xconomy.api.event.AccountEvent;
import me.yic.xconomy.api.event.NonPlayerAccountEvent;
import me.yic.xconomy.api.event.PlayerAccountEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin implements Listener {

    private static ExamplePlugin instance;

    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("XConomy successfully enabled!");

    }

    public void onDisable() {
        getLogger().info("XConomy successfully disabled!");
    }

    public static ExamplePlugin getInstance() {
        return instance;
    }

    //监听所有转账事件（全局事件除外）
    //Listen to all transfer events (except global events)
    @EventHandler
    private void listenaccount(AccountEvent event) {
        getLogger().info(event.getaccountname());
        getLogger().info(event.getamount().toString());
    }

    //监听所有非玩家账户转账事件
    //Listen to all non-player account transfer events
    @EventHandler
    private void listennonaccount(NonPlayerAccountEvent event) {
        getLogger().info(event.getaccountname());
        getLogger().info(event.getamount().toString());
    }

    //监听所有玩家账户转账事件（全局事件除外）
    //Listen to all player account transfer events (except global events)
    @EventHandler
    private void listenplayeraccount(PlayerAccountEvent event) {
        getLogger().info(event.getUniqueId().toString());
        getLogger().info(event.getamount().toString());
    }
}
```