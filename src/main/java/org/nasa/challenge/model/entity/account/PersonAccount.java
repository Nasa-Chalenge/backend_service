package org.nasa.challenge.model.entity.account;

import org.nasa.challenge.model.entity.Helper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@Entity
public class PersonAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false, updatable = false)
    private BigInteger id;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "social_id")
    private String socialId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "person_account")
    private Helper activeHelper;

    @OneToMany(mappedBy = "person_account")
    private List<Helper> historyOfHelper;

    public BigInteger getId() {
        return id;
    }

    public void setId(final BigInteger id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(final boolean active) {
        isActive = active;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(final String socialId) {
        this.socialId = socialId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
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

    public List<Helper> getHistoryOfHelper() {
        return historyOfHelper;
    }

    public void setHistoryOfHelper(final List<Helper> historyOfHelper) {
        this.historyOfHelper = historyOfHelper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonAccount)) return false;
        PersonAccount that = (PersonAccount) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
