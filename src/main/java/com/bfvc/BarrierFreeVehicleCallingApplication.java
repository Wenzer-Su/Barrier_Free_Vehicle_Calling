package com.bfvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bfvc.dao.mapper")
public class BarrierFreeVehicleCallingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarrierFreeVehicleCallingApplication.class, args);
    }

}
