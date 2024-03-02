package hello.external;

import lombok.extern.slf4j.Slf4j;

/**
 * 커맨드 라인 인수
 */
@Slf4j
public class CommandLineV1 {

    //url=devdb username=dev_user password=dev_pw
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);
        }
    }
}
