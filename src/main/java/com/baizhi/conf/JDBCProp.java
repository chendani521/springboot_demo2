//package com.baizhi.conf;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//
///*2.声明配置属性类*/
//@ConfigurationProperties(prefix = "jdbc")
//public class JDBCProp {
//    String url;
//    String driver;
//    String username;
//    String password;
//
//    public JDBCProp(String url, String driver, String username, String password) {
//        this.url = url;
//        this.driver = driver;
//        this.username = username;
//        this.password = password;
//    }
//
//    public JDBCProp() {
//
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getDriver() {
//        return driver;
//    }
//
//    public void setDriver(String driver) {
//        this.driver = driver;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "JDBCProp{" +
//                "url='" + url + '\'' +
//                ", driver='" + driver + '\'' +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}
