package com.example.app.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app.model.User;

public interface UserReporitory extends JpaRepository<User, UUID> {
}
