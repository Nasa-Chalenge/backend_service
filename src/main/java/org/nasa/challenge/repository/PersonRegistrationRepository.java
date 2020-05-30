package org.nasa.challenge.repository;

import org.nasa.challenge.model.entity.account.PersonAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRegistrationRepository extends JpaRepository<String, PersonAccount> {
}
