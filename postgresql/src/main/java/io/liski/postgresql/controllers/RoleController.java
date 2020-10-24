package io.liski.postgresql.controllers;

import io.liski.postgresql.domain.Role;
import io.liski.postgresql.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/role")
    public Role addBook(Role role) {
        roleRepository.save(role);
        return role;
    }
}
