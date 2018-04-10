package rest_api.rest_api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest_api.rest_api.model.entity.Users;
import rest_api.rest_api.model.repository.UsersRepository;

@Component
public class UsersService {
    
    @Autowired
    private UsersRepository usersRepository;
    
    public Users getUser(Long userId) {
    
        if(userId < 1) {
            throw new IllegalArgumentException("userId is less than 1");
        }
        
        return usersRepository.findOne(userId);
        
    }

    public Users createUser(Users user) {
        
        if(user == null) {
            throw new IllegalArgumentException("user is null");
        }
        
        return usersRepository.save(user);
        
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public void deleteUser(Long userId) {
        
        if(userId < 1) {
            throw new IllegalArgumentException("userId is less than 1");
        }
        usersRepository.delete(userId);
    }
    
}
