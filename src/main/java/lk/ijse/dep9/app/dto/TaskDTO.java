package lk.ijse.dep9.app.dto;

import lk.ijse.dep9.app.util.ValidationGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO implements Serializable {
    @Null(groups = {ValidationGroup.Create.class, ValidationGroup.Update.class}, message = "Task project id can't be specified")
    private Integer id;
    @NotBlank(message = "Task content cannot be empty or null")
    private String content;
    @Null(groups = {ValidationGroup.Create.class, ValidationGroup.Update.class}, message = "Task project id can't be specified")
    private Integer projectId;

    public TaskDTO(Integer id, Integer projectId) {
        this.id = id;
        this.projectId = projectId;
    }
}
