package com.example.dockerspringproj;

import com.example.dockerspringproj.controller.FixedDepositController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DockerspringprojApplication {
    private static Logger logger = LogManager.getLogger(DockerspringprojApplication.class);

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/applicationContext.xml");

        FixedDepositController fixedDepositController = (FixedDepositController) context
                .getBean("controller");

        logger.info("Submission status of fixed deposit : "
                + fixedDepositController.submit());
        logger.info("Returned fixed deposit info : "
                + fixedDepositController.get());
    }
}
