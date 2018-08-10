package com.uipath.spectrum.dashboard.repository;

import com.uipath.spectrum.dashboard.model.DashboardUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<DashboardUser, Integer> {
}
