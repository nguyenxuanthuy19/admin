package com.daoxuanson.service.impl;

import com.daoxuanson.entity.Role;
import com.daoxuanson.repository.RoleRepository;
import com.daoxuanson.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findOne(long id){
        return roleRepository.findOne(id);
    }
}
