package lk.ijse.dep9.app.dto;

import lk.ijse.dep9.app.util.ValidationGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO implements Serializable {
    @Null(groups = ValidationGroup.Create.class, message = "Project id can't be specified")
    private Integer id;
    @NotBlank(message = "Project name cannot be empty or null")
    @Length(min = 3, message = "Project name should be at least 3 characters long")
    private String name;
    private String username;
}
