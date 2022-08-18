package ru.dkonyukhov.dz5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dkonyukhov.dz5.model.User;

public interface UserRepository extends JpaRepository <User, Integer>{
}
