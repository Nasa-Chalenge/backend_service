package org.nasa.challenge.model;

import java.util.Objects;

public class RegistrationRequestDto {

    private final User user;

    private final String password;

    public RegistrationRequestDto(final User user, final String password) {
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistrationRequestDto)) return false;
        RegistrationRequestDto that = (RegistrationRequestDto) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }

}
