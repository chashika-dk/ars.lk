package ars.lk.service;

import ars.lk.dto.UserDTO;

public interface UserService {
    boolean loginVerification(UserDTO user);
    boolean saveUser(UserDTO user);
}
