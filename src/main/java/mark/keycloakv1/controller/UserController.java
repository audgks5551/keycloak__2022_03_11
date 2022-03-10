package mark.keycloakv1.controller;

import lombok.RequiredArgsConstructor;
import mark.keycloakv1.model.User;
import mark.keycloakv1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    public final UserRepository userRepository;

    @PostMapping("/admin")
    public ResponseEntity<User> saveUser(User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/user")
    public ResponseEntity getUser() {
        return ResponseEntity.ok("ok");
    }
}
