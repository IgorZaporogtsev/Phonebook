package phonebook.controller;

import phonebook.model.Role;
import phonebook.model.User;
import phonebook.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class Registration {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        user.setActive(true);
        if(userRepo.count() > 0) {
            user.setRoles(Collections.singleton(Role.USER));
        }
        else{
            user.setRoles(Collections.singleton(Role.ADMIN));
        }
        userRepo.save(user);

        return "redirect:/login";
    }


}
