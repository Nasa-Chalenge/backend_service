package org.nasa.challenge.controller;

import io.swagger.annotations.ApiOperation;

import org.nasa.challenge.model.dto.PersonRegistrationDto;
import org.nasa.challenge.model.dto.VolunteerRegistrationDto;
import org.nasa.challenge.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/registration")
@Validated
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(final RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/person")
    @ApiOperation("Register a new person")
    public BigInteger registerPerson(@RequestBody final PersonRegistrationDto registrationRequest) {
        return registrationService.registerNewPerson(registrationRequest);
    }

    @PostMapping("/volunteer")
    @ApiOperation("Register a new volunteer")
    public BigInteger registerVolunteer(@RequestBody final VolunteerRegistrationDto registrationRequest) {
        return registrationService.registerNewVolunteer(registrationRequest);
    }

}
