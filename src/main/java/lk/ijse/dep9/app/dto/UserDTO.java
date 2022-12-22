package lk.ijse.dep9.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lk.ijse.dep9.app.util.ValidationGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = "password", allowSetters = true)
public class UserDTO implements Serializable {
    @NotBlank(message = "full_name can't be empty or null")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid name")
    private String fullName;
    @NotBlank(message = "username can't be empty or null", groups = ValidationGroup.Create.class)
    private String username;
    @NotEmpty(message = "Password can't be empty or null")
    @Length(min = 3, message = "Password should be at least 3 characters long")
    private String password;
}
