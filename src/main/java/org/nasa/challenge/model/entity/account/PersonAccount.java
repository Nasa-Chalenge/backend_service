package org.nasa.challenge.model.entity.account;

import org.nasa.challenge.model.entity.Helper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class PersonAccount extends Account {

    @Column(name = "social_id")
    private String socialId;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "person_account")
    private Helper activeHelper;

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(final String socialId) {
        this.socialId = socialId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Helper getActiveHelper() {
        return activeHelper;
    }

    public void setActiveHelper(final Helper activeHelper) {
        this.activeHelper = activeHelper;
    }

}
