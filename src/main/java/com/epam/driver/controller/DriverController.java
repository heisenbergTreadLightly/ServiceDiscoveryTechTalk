package com.epam.driver.controller;

import com.epam.driver.controller.response.DriverResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("driver")
public class DriverController {

    @RequestMapping("/{driverId}")
    public DriverResponse getDriverInfo(@PathVariable("driverId") int driverId) {
        return getDriver(driverId);
    }

    private DriverResponse getDriver(int driverId) {
        DriverResponse driverResponse = new DriverResponse();
        driverResponse.setFirstName("Himanshu");
        driverResponse.setLastName("Ghai");
        driverResponse.setRating("4.8");

        return driverResponse;
    }


}
