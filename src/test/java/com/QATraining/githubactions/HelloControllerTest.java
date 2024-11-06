package com.QATraining.githubactions;

import com.QATraining.githubactions.GithubActionsApplication;
import com.QATraining.githubactions.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = GithubActionsApplication.class)
public class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Test
    void contextLoads() {
        assertThat(controller.sayHello()).isEqualTo("Hello World!");
    }
}
