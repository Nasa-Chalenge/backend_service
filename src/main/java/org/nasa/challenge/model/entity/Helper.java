package org.nasa.challenge.model.entity;

import org.nasa.challenge.model.entity.account.Account;
import org.nasa.challenge.model.enums.HelperAction;
import org.nasa.challenge.model.enums.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Helper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(name = "name")
    private String name;

    @Column(name = "action")
    @Enumerated(EnumType.STRING)
    private HelperAction action;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setUserId(final Account personAccount) {
        this.account = personAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HelperAction getAction() {
        return action;
    }

    public void setAction(final HelperAction action) {
        this.action = action;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helper)) return false;
        Helper helper = (Helper) o;
        return id == helper.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
