package org.nasa.challenge.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.nasa.challenge.model.Person;
import org.nasa.challenge.model.User;

import java.util.Objects;

@ApiModel("Registration request for user")
public class PersonRegistrationDto extends AbstractRegistrationRequestDto {

    @ApiModelProperty("Person")
    private final Person person;

    public PersonRegistrationDto(final String password, final Person person) {
        super(password);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonRegistrationDto)) return false;
        if (!super.equals(o)) return false;
        PersonRegistrationDto that = (PersonRegistrationDto) o;
        return Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), person);
    }

}
