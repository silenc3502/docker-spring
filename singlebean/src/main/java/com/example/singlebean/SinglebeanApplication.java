package com.example.singlebean;

import com.example.singlebean.controller.FixedDepositController;
import com.example.singlebean.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinglebeanApplication {

    private static Logger logger = LogManager.getLogger(SinglebeanApplication.class);

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/applicationContext.xml");

        FixedDepositController controller1 = (FixedDepositController) context
                .getBean("controller");
        FixedDepositController controller2 = (FixedDepositController) context
                .getBean("controller");

        FixedDepositDetails fixedDepositDetails1 = (FixedDepositDetails) context
                .getBean("fixedDepositDetails");
        FixedDepositDetails fixedDepositDetails2 = (FixedDepositDetails) context
                .getBean("fixedDepositDetails");

        if (controller1 == controller2) {
            logger.info("Same FixedDepositController instance");
        } else {
            logger.info("Different FixedDepositController instances");
        }
        if (fixedDepositDetails1 == fixedDepositDetails2) {
            logger.info("Same FixedDepositDetails instance");
        } else {
            logger.info("Different FixedDepositDetails instances");
        }
    }
}
