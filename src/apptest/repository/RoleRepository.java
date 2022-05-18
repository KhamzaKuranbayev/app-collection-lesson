package apptest.repository;

import apptest.model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleRepository {
    public static List<Role> roles = new ArrayList<>();

    public static List<Role> getRoles() {
        return roles;
    }

    public static void setRoles(List<Role> roles) {
        RoleRepository.roles = roles;
    }

    public static void viewRoles() {
        System.out.println(roles);
    }
}
