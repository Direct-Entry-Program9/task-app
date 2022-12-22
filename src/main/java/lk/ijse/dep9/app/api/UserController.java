package lk.ijse.dep9.app.api;

import lk.ijse.dep9.app.dto.UserDTO;
import lk.ijse.dep9.app.service.custom.UserService;
import lk.ijse.dep9.app.util.ValidationGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@Validated(ValidationGroup.Create.class) @RequestBody UserDTO user) throws SQLException {
//        Optional<FieldError> firstError = errors.getFieldErrors().stream().findFirst();
//        if (firstError.isPresent()){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,firstError.get().getDefaultMessage());
//        }
        System.out.println("Here");
        userService.createNewUserAccount(user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/me", consumes = "application/json")
    public void updateUserAccountDetails(@Valid @RequestBody UserDTO user){
        System.out.println(user);
    }

    @GetMapping(value = "/me", produces = "application/json")
    public UserDTO getUserAccountDetails(@RequestAttribute String username){
        return userService.getUserAccountDetails(username);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/me")
    public void deleteUserAccount(){
        System.out.println("deleteUserAccount()");
    }

}
