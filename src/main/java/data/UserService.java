package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(Users user) {
        repository.save(user);
    }
    public Users getUser(String id) {
        return repository.findById(id).orElse(null);
    }
    public List<Users> getAllUsers(){
        return repository.findAll();
    }
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}