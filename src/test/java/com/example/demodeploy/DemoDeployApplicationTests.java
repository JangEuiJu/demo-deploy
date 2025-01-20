package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // 에러 강제 발생
        int a = 1/0;
        throw new RuntimeException("오류 발생");
    }

}
