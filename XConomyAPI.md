# About XConomyAPI
For XConomy 2.17.2
## Chinese
```java
XConomyAPI xcapi = new XConomyAPI;
```

```java
xcapi.getversion();
```
获取XConomy版本号，返回String

```java
xcapi.isbungeecordmode();
```
是否启用BC模式，返回boolean

```java
xcapi.formatdouble(String amount);
```
格式化amount，返回BigDecimal

```java
xcapi.getdisplay(BigDecimal balance);
```
将金额转为显示消息，返回String  
比如 5,000 元

```java
xcapi.createPlayerData(uid, name);
```
创建玩家数据

```java
xcapi.getPlayerData(UUID uid);
xcapi.getPlayerData(String name);
```
获取玩家数据，返回PlayerData

```java
//获取玩家UUID
PlayerData.getUniqueId();
//获取玩家名称
PlayerData.getName();
//获取玩家金额，返回BigDecimal
PlayerData.getBalance();
//获取验证数据是否有效，返回boolean
PlayerData.isValid();
```
关于PlayerData

```java
xcapi.getorcreateAccountBalance(String account);
```
获取非玩家账号金额，返回BigDecimal

```java
xcapi.ismaxnumber(BigDecimal amount);
```
检查金额是否为最大值，返回boolean

```java
xcapi.changePlayerBalance(UUID u, String playername, BigDecimal amount, Boolean isadd);
```
对金额进行修改，返回Integer  
isadd = true 为增加金额  
isadd = false 为扣除金额  
isadd = null 为设置金额  
返回0 表示成功  
返回1 失败，表示BC模式且没有玩家存在  
返回2 失败,表示玩家余额不足  
返回3 失败,表示玩家余额超出最大值

```java
xcapi.changeAccountBalance(String account, BigDecimal amount, Boolean isadd);
```
对金额进行修改，返回Integer  
isadd = true 为增加金额  
isadd = false 为扣除金额  
isadd = null 为设置金额  
返回0 表示成功  
返回2 失败,表示玩家余额不足  
返回3 失败,表示玩家余额超出最大值

```java
xcapi.getbalancetop();
```
获取TOP10名单，返回List<String>

```java
xcapi.getsumbalance();
```
获取服务器金额总数，返回BigDecimal

```java   
xcapi.getglobalpermission(String permission);
```
获取全局权限状态，返回boolean  
eg: boolean value = xcapi.getglobalpermission("pay");

```java
xcapi.setglobalpermission(String permission, boolean vaule);
```
设置全局权限状态  
eg: xcapi.setglobalpermission("pay", true);

```java
xcapi.getpaymentpermission(UUID uid);
```
获取玩家pay指令权限状态，返回Boolean
返回null表示无数据

```java
xcapi.setglobalpermission(String permission, boolean vaule);
```
设置玩家pay指令权限状态
value为null时表示移除数据


****


## English
```java
XConomyAPI xcapi = new XConomyAPI;
```

```java
xcapi.getversion();
```
Gets the xconomy version number, return String

```java 
xcapi.isbungeecordmode();
```
Check whether BC mode is enabled, return boolean

```java
xcapi.formatdouble(String amount);
```
Format amount, return BigDecimal

```java
xcapi.getdisplay(BigDecimal balance);
```
Convert the amount to display message, return String  
For example: 5,000 dollars

```java
xcapi.createPlayerData(uid, name);
```
Creating player data

```java
xcapi.getPlayerData(UUID uid);
xcapi.getPlayerData(String name);
```
Get player data，return PlayerData

```java
//Get player UUID
PlayerData.getUniqueId();
//Get player name
PlayerData.getName();
//Get player balance，return BigDecimal
PlayerData.getBalance();
//Verify the data is valid，return boolean
PlayerData.isValid();
```
About PlayerData

```java
xcapi.getorcreateAccountBalance(String account);
```
Get non-player-account，return BigDecimal

```java
xcapi.ismaxnumber(BigDecimal amount);
```
Check whether the amount is the maximum value, return boolean

```java
xcapi.changePlayerBalance(UUID u, String playername, BigDecimal amount, Boolean isadd);
```
Modify the amount, return Integer  
isadd = true, add amount to balacne  
isadd = false, take amount from balance  
isadd = null, set amount to balance  
return 0 means success  
return 1 means failure that BungeeCord mode is enabled and no player is online  
return 2 means failure that the player's balance is insufficient  
return 3 means failure that the player's balance exceeds the maximum value

```java
xcapi.changeAccountBalance(String account, BigDecimal amount, Boolean isadd);
```
Modify the amount, return Integer  
isadd = true, add amount to balacne  
isadd = false, take amount from balance  
isadd = null, set amount to balance  
return 0 means success  
return 2 means failure that the player's balance is insufficient  
return 3 means failure that the player's balance exceeds the maximum value

```java
xcapi.getbalancetop();
```
Get the list of TOP10, return List<String>

```java
xcapi.getsumbalance();
```
Get the total amount of the server, return BigDecimal

```java  
xcapi.getglobalpermission(String permission);
```
Get global permission state, return boolean  
eg: boolean value = xcapi.getglobalpermission("pay");

```java
xcapi.setglobalpermission(String permission, boolean vaule);
```
Set global permission state  
eg: xcapi.setglobalpermission("pay", true);

```java 
xcapi.getpaymentpermission(UUID uid);
```
Get player pay command permission status, return Boolean  
Return null to indicate no data

```java
xcapi.setglobalpermission(String permission, boolean vaule);
```
Set player pay command permission status  
When value is null, the data is removed