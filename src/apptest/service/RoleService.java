package apptest.service;

import apptest.model.Role;

public interface RoleService {

    void save(Role role);

    Role findByRoleName(String roleName);

}
