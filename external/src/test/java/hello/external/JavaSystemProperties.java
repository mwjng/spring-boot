package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * 자바 시스템 속성
 */
@Slf4j
public class JavaSystemProperties {

    //-Durl=devdb -Dusername=dev_user -Dpassword=dev_pw
    public static void main(String[] args) {

        System.setProperty("hello_key", "hello_value");

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}", key, System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }
}
