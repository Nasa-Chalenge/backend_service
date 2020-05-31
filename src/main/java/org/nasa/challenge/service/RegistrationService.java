package org.nasa.challenge.service;

import org.nasa.challenge.model.dto.PersonRegistrationDto;
import org.nasa.challenge.model.dto.VolunteerRegistrationDto;
import org.nasa.challenge.repository.PersonRegistrationRepository;
import org.nasa.challenge.repository.VolunteerRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class RegistrationService {

    private final PersonRegistrationRepository personRepository;

    private final VolunteerRegistrationRepository volunteerRepository;

    @Autowired
    public RegistrationService(final PersonRegistrationRepository personRepository, final VolunteerRegistrationRepository volunteerRepository) {
        this.personRepository = personRepository;
        this.volunteerRepository = volunteerRepository;
    }

    public BigInteger registerNewPerson(final PersonRegistrationDto registrationRequest) {

    }

    public BigInteger registerNewVolunteer(final VolunteerRegistrationDto registrationRequest) {

    }

}
