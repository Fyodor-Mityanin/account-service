package com.pet.accountservice.dto;

import java.io.Serializable;
import java.util.Objects;

public class UserDTO implements Serializable {
    private final String name;
    private final String lastname;
    private final String email;

    public UserDTO(String name, String lastname, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO entity = (UserDTO) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.email, entity.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, email);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "lastname = " + lastname + ", " +
                "email = " + email + ")";
    }
}
