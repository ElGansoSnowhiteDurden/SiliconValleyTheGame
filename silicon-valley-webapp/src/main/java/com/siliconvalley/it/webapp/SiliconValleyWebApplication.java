package com.siliconvalley.it.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web Application launcher.
 *
 */
@SpringBootApplication
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
