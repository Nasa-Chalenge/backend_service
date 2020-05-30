package org.nasa.challenge.model;

public class Person extends User {

    private final String socialId;

    private final String address;

    public Person(final String id, final String firstName, final String lastName, final String socialId, final String address) {
        super(id, firstName, lastName);
        this.socialId = socialId;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getSocialId() {
        return socialId;
    }

}
