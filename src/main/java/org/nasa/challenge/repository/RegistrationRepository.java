package org.nasa.challenge.repository;

import org.nasa.challenge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<String, User> {

}
