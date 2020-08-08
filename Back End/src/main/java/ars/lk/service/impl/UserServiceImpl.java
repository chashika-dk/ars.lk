package ars.lk.service.impl;

import ars.lk.dto.UserDTO;
import ars.lk.entity.User;
import ars.lk.repository.userRepository;
import ars.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly =  true)
public class UserServiceImpl implements UserService {
    @Autowired
    private userRepository userRepository;

    @Override
    public boolean loginVerification(UserDTO userDTO) {

        boolean exists =userRepository.existsById(userDTO.getEmail());
        if (!exists){
            return false;
        }

        User user = userRepository.findById(userDTO.getEmail()).get();
        return user.getPassword().equals(userDTO.getPassword());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveUser(UserDTO userDTO) {
        User user=new User(
                userDTO.getEmail(),
                userDTO.getNic(),
                userDTO.getFullname(),
                userDTO.getHomeaddress(),
                userDTO.getDistrict(),
                userDTO.getMobilenumber(),
                userDTO.getProfession(),
                userDTO.getUniversity(),
                userDTO.getType(),
                userDTO.getPassword()
        );

        userRepository.save(user);
        return true;
    }
}
