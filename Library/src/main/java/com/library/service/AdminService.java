package com.library.service;

import com.library.dto.AdminDto;
import com.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
