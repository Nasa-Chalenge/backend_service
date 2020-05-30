package org.nasa.challenge.model.entity.account;

import org.nasa.challenge.model.entity.Helper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class VolunteerAccount extends Account {

    @Column(name = "government_id")
    private String governmentId;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private System phoneNumber;

    @OneToMany(mappedBy = "volunteer_account")
    private List<Helper> activeHelpers;

    public String getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(final String governmentId) {
        this.governmentId = governmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public System getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final System phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Helper> getActiveHelpers() {
        return activeHelpers;
    }

    public void setActiveHelpers(final List<Helper> activeHelpers) {
        this.activeHelpers = activeHelpers;
    }

}
