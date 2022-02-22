package com.pet.accountservice.dto;

import java.io.Serializable;
import java.util.Objects;

public class UserPassDTO implements Serializable {
    private final String name;
    private final String lastname;
    private final String email;
    private final String password;

    public UserPassDTO(String name, String lastname, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPassDTO entity = (UserPassDTO) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.password, entity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, email, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "lastname = " + lastname + ", " +
                "email = " + email + ")";
    }
}
