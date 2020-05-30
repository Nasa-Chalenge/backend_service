package org.nasa.challenge.repository;

import org.nasa.challenge.model.entity.account.VolunteerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRegistrationRepository extends JpaRepository<String, VolunteerAccount> {
}
