package ars.lk.repository;

import ars.lk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository <User,String> {
}
