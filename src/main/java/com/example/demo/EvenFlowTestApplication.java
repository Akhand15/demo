// src/main/java/com/evenflow/hello/HelloApplication.java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class EvenFlowTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvenFlowTestApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Hello from EvenFlow!</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
                    }
                    .container {
                        text-align: center;
                        background: white;
                        padding: 60px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                    }
                    h1 {
                        color: #667eea;
                        font-size: 48px;
                        margin: 0;
                    }
                    p {
                        color: #666;
                        font-size: 18px;
                        margin-top: 20px;
                    }
                    .emoji {
                        font-size: 64px;
                        margin-bottom: 20px;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="emoji">🚀</div>
                    <h1>Hello from Spring Boot!</h1>
                    <p>Deployed via EvenFlow</p>
                    <p style="font-size: 14px; color: #999; margin-top: 40px;">
                        Built with AWS CodeBuild + Deployed to Google Cloud Run
                    </p>
                </div>
            </body>
            </html>
            """;
    }

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "{\"status\":\"UP\"}";
    }
}