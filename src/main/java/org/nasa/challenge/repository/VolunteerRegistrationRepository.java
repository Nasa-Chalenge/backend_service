package org.nasa.challenge.repository;

import org.nasa.challenge.model.account.VolunteerAccountData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRegistrationRepository extends JpaRepository<String, VolunteerAccountData> {
}
