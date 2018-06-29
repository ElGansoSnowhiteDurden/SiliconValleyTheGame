/*
 *
 */
package com.siliconvalley.it.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Web Application launcher.
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.siliconvalley.it")
public class SiliconValleyWebApplication {

  /**
   * Starts Tomcat and deploy the web application.
   *
   * @param args launch arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(SiliconValleyWebApplication.class, args);
  }
}
