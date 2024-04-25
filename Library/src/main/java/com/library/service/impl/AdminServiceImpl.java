package com.library.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.library.dto.AdminDto;
import com.library.model.Admin;
import com.library.repository.AdminRepository;
import com.library.repository.RoleRepository;
import com.library.service.AdminService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private static volatile AdminServiceImpl instance;

    private final AdminRepository adminRepository;
    private final RoleRepository roleRepository;

    public static synchronized AdminServiceImpl getInstance(AdminRepository adminRepository, RoleRepository roleRepository) {
        if (instance == null) {
            instance = new AdminServiceImpl(adminRepository, roleRepository);
        }
        return instance;
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}

