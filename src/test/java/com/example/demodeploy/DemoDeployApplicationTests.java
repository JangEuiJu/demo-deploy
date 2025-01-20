package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // 에러 강제 발생
        // 깃에는 반영이 되지만, 배포 및 운영에는 반영 x
//        int a = 1/0;
//        throw new RuntimeException("오류 발생");
    }

}
