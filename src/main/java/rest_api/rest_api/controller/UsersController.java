package rest_api.rest_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rest_api.rest_api.model.entity.Users;
import rest_api.rest_api.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;    
    
    @ResponseBody
    @GetMapping
    public List<Users> getUsers(){
        return usersService.getUsers();
    }
    
    @ResponseBody
    @GetMapping("/{id}")
    public Users getUser(@PathVariable("id")Long id){
        return usersService.getUser(id);
    }
    
    @ResponseBody
    @PostMapping
    public Users postUser(@RequestBody Users user){
        return usersService.createUser(user);
    }
    
    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Long id){
        usersService.deleteUser(id);
    }
    
}
