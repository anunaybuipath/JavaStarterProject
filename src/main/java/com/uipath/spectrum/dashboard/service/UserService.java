package com.uipath.spectrum.dashboard.service;

import com.uipath.spectrum.dashboard.model.DashboardUser;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public DashboardUser getUser(Integer id) {
        return new DashboardUser();
    }
}
