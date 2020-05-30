package org.nasa.challenge.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel("Registration request")
public class AbstractRegistrationRequestDto {

    @ApiModelProperty("User password")
    private final String password;

    public AbstractRegistrationRequestDto(final String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractRegistrationRequestDto)) return false;
        AbstractRegistrationRequestDto that = (AbstractRegistrationRequestDto) o;
        return Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

}
