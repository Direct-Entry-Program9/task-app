package lk.ijse.dep9.app.service.custom;

import lk.ijse.dep9.app.dto.UserDTO;
import lk.ijse.dep9.app.service.SuperService;

import java.sql.SQLException;

public interface UserService extends SuperService {

    void createNewUserAccount(UserDTO userDTO) throws SQLException;

    UserDTO verifyUser(String username, String password);

    UserDTO getUserAccountDetails(String username);

}
