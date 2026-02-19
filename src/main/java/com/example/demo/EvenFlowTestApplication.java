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
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>EvenFlow | Deployment ho gaya!!!</title>
                <style>
                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }

                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        min-height: 100vh;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        background: #0f0f23;
                        overflow: hidden;
                        position: relative;
                    }

                    /* Animated gradient background */
                    .gradient-bg {
                        position: fixed;
                        width: 100%;
                        height: 100%;
                        z-index: 0;
                    }

                    .gradient-blob {
                        position: absolute;
                        border-radius: 50%;
                        filter: blur(80px);
                        opacity: 0.6;
                        animation: float 20s infinite ease-in-out;
                    }

                    .blob-1 {
                        width: 500px;
                        height: 500px;
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
                        top: -10%;
                        left: -10%;
                        animation-delay: 0s;
                    }

                    .blob-2 {
                        width: 400px;
                        height: 400px;
                        background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
                        bottom: -5%;
                        right: -5%;
                        animation-delay: -7s;
                    }

                    .blob-3 {
                        width: 350px;
                        height: 350px;
                        background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                        top: 40%;
                        right: 10%;
                        animation-delay: -14s;
                    }

                    @keyframes float {
                        0%, 100% {
                            transform: translate(0, 0) scale(1);
                        }
                        33% {
                            transform: translate(30px, -50px) scale(1.1);
                        }
                        66% {
                            transform: translate(-20px, 20px) scale(0.9);
                        }
                    }

                    /* Main container */
                    .container {
                        position: relative;
                        z-index: 1;
                        text-align: center;
                        background: rgba(255, 255, 255, 0.05);
                        backdrop-filter: blur(20px);
                        padding: 80px 60px;
                        border-radius: 30px;
                        border: 1px solid rgba(255, 255, 255, 0.18);
                        box-shadow: 0 30px 90px rgba(0, 0, 0, 0.5);
                        max-width: 700px;
                        width: 90%;
                    }

                    /* Animated emoji */
                    .emoji {
                        font-size: 100px;
                        margin-bottom: 30px;
                        animation: rocket 2s ease-in-out infinite;
                        display: inline-block;
                    }

                    @keyframes rocket {
                        0%, 100% {
                            transform: translateY(0) rotate(-5deg);
                        }
                        50% {
                            transform: translateY(-20px) rotate(5deg);
                        }
                    }

                    h1 {
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 50%, #f093fb 100%);
                        -webkit-background-clip: text;
                        -webkit-text-fill-color: transparent;
                        background-clip: text;
                        font-size: 56px;
                        font-weight: 800;
                        margin-bottom: 20px;
                        letter-spacing: -1px;
                    }

                    .subtitle {
                        color: rgba(255, 255, 255, 0.9);
                        font-size: 24px;
                        margin-bottom: 40px;
                        font-weight: 300;
                    }

                    /* Status badges */
                    .status-container {
                        display: flex;
                        justify-content: center;
                        gap: 15px;
                        flex-wrap: wrap;
                        margin-top: 40px;
                    }

                    .status-badge {
                        background: rgba(255, 255, 255, 0.1);
                        border: 1px solid rgba(255, 255, 255, 0.2);
                        padding: 12px 24px;
                        border-radius: 50px;
                        color: #fff;
                        font-size: 14px;
                        font-weight: 500;
                        display: flex;
                        align-items: center;
                        gap: 8px;
                        transition: all 0.3s ease;
                    }

                    .status-badge:hover {
                        background: rgba(255, 255, 255, 0.2);
                        transform: translateY(-2px);
                    }

                    .status-badge .dot {
                        width: 8px;
                        height: 8px;
                        border-radius: 50%;
                        background: #4ade80;
                        animation: pulse 2s ease-in-out infinite;
                    }

                    @keyframes pulse {
                        0%, 100% {
                            opacity: 1;
                            transform: scale(1);
                        }
                        50% {
                            opacity: 0.5;
                            transform: scale(1.2);
                        }
                    }

                    /* Pipeline info */
                    .pipeline-info {
                        margin-top: 50px;
                        padding-top: 30px;
                        border-top: 1px solid rgba(255, 255, 255, 0.1);
                    }

                    .pipeline-step {
                        display: inline-flex;
                        align-items: center;
                        color: rgba(255, 255, 255, 0.7);
                        font-size: 14px;
                        margin: 0 10px;
                    }

                    .pipeline-step::after {
                        content: "→";
                        margin-left: 15px;
                        color: rgba(255, 255, 255, 0.4);
                    }

                    .pipeline-step:last-child::after {
                        content: "";
                    }

                    .tech-icon {
                        font-size: 18px;
                        margin-right: 6px;
                    }

                    /* Responsive */
                    @media (max-width: 768px) {
                        .container {
                            padding: 50px 30px;
                        }

                        h1 {
                            font-size: 40px;
                        }

                        .subtitle {
                            font-size: 18px;
                        }

                        .emoji {
                            font-size: 80px;
                        }

                        .pipeline-step {
                            font-size: 12px;
                            margin: 5px;
                        }
                    }
                </style>
            </head>
            <body>
                <div class="gradient-bg">
                    <div class="gradient-blob blob-1"></div>
                    <div class="gradient-blob blob-2"></div>
                    <div class="gradient-blob blob-3"></div>
                </div>

                <div class="container">
                    <div class="emoji">🚀</div>
                    <h1>Deployment Successful</h1>
                    <p class="subtitle">Spring Boot powered by EvenFlow</p>

                    <div class="status-container">
                        <div class="status-badge">
                            <span class="dot"></span>
                            <span>Live</span>
                        </div>
                        <div class="status-badge">
                            <span>⚡</span>
                            <span>Cloud Run</span>
                        </div>
                        <div class="status-badge">
                            <span>🔧</span>
                            <span>Spring Boot 3.x</span>
                        </div>
                    </div>

                    <div class="pipeline-info">
                        <div class="pipeline-step">
                            <span class="tech-icon">📦</span>
                            <span>AWS CodeBuild</span>
                        </div>
                        <div class="pipeline-step">
                            <span class="tech-icon">🐳</span>
                            <span>Docker</span>
                        </div>
                        <div class="pipeline-step">
                            <span class="tech-icon">☁️</span>
                            <span>Google Cloud Run</span>
                        </div>
                    </div>
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
