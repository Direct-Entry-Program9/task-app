package lk.ijse.dep9.app.util;

import javax.validation.groups.Default;

public interface ValidationGroup {
    interface Create extends Default{}
    interface Update extends Default{}
    interface Delete extends Default{}
}
