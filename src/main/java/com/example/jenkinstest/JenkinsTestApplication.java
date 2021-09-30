package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

    /**
     * 为了模拟spring boot项目关闭需要一段时间
     * @Date 7:50 下午 2021/9/30
     **/
    @Component
    public class Listener implements ApplicationListener<ApplicationEvent> {

        @Override
        public void onApplicationEvent(ApplicationEvent event) {
            if (event instanceof ContextClosedEvent) {
                this.sleep(10);
            }
        }

        private void sleep(int seconds) {
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException ignore) {
            }
        }

    }
}
