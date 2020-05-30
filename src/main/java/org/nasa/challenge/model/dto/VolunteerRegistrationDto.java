package org.nasa.challenge.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.nasa.challenge.model.Volunteer;

import java.util.Objects;

@ApiModel("Registration request for volunteer")
public class VolunteerRegistrationDto extends AbstractRegistrationRequestDto {

    @ApiModelProperty("Volunteer")
    private final Volunteer volunteer;

    public VolunteerRegistrationDto(final String password, final Volunteer volunteer) {
        super(password);
        this.volunteer = volunteer;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VolunteerRegistrationDto)) return false;
        if (!super.equals(o)) return false;
        VolunteerRegistrationDto that = (VolunteerRegistrationDto) o;
        return Objects.equals(volunteer, that.volunteer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volunteer);
    }

}
