package io.liski.postgresql.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String name;

    @OneToMany(mappedBy="role")
    Set<User> users = new HashSet<>();

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long id) {
        this.role_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
