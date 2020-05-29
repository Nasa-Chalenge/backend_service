package org.nasa.challenge.model;

import java.util.Objects;

public class User {

    private final String id;

    private final String firstName;

    private final String secondName;

    private final String address;

    public User(final String id, final String firstName, final String secondName, final String address) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(secondName, user.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName);
    }

}
