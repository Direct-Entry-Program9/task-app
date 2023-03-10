package lk.ijse.dep9.app.util;

import lk.ijse.dep9.app.dto.ProjectDTO;
import lk.ijse.dep9.app.dto.TaskDTO;
import lk.ijse.dep9.app.dto.UserDTO;
import lk.ijse.dep9.app.entity.Project;
import lk.ijse.dep9.app.entity.Task;
import lk.ijse.dep9.app.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Transformer {

    private final ModelMapper mapper;

    public Transformer(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public User toUser(UserDTO userDTO){
        return mapper.map(userDTO,User.class);
    }
    public UserDTO toUserDTO(User user){
        return mapper.map(user,UserDTO.class);
    }

    public Project toProject(ProjectDTO projectDTO){
        return mapper.map(projectDTO, Project.class);
    }

    public ProjectDTO toProjectDTO(Project project){
        return mapper.map(project, ProjectDTO.class);
    }

    public Task toTask(TaskDTO taskDTO){
        return mapper.map(taskDTO, Task.class);
    }

    public TaskDTO toTaskDTO(Task task){
        return mapper.map(task, TaskDTO.class);
    }


}
