package br.com.mtisi.course.contorller;


import br.com.mtisi.course.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findALL(){
        User user = new User(1L, "Rafael Missio", "rtmissio@gmail.com", "(19)9 9162-5876","missio@@13");
        return ResponseEntity.ok().body(user);
    }
}
