package org.nasa.challenge.repository;

import org.nasa.challenge.model.account.PersonAccountData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRegistrationRepository extends JpaRepository<String, PersonAccountData> {
}
