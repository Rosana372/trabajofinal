package com.informatorio.services;

import java.util.ArrayList;
import com.informatorio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informatorio.models.UserModel;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios(){
        return(ArrayList<UserModel>) userRepository.findAll();

    }
    
    public UserModel guardarUsuario(UserModel usuario){
        return userRepository.save(usuario);
    }
}
