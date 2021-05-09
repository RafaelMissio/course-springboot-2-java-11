package br.com.mtisi.course.services;

import br.com.mtisi.course.model.User;
import br.com.mtisi.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User finbById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
