package apptest.service.impl;

import apptest.model.Role;
import apptest.repository.RoleRepository;
import apptest.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Override
    public void save(Role role) {
        List<Role> roles = RoleRepository.getRoles();
        roles.add(role);
        RoleRepository.setRoles(roles);
    }

    @Override
    public Role findByRoleName(String roleName) {
        List<Role> roles = RoleRepository.getRoles();
        for (Role role : roles) {
            if(role.getName().equalsIgnoreCase(roleName))
                return role;
        }
        return null;
    }
}
