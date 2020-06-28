import java.sql.*;
import java.util.*;

/**
 *
 * @author irrrma
 */
public interface form01 {
    Form insert(Form FORM) throws SQLException;
    void update(Form FORM) throws SQLException;
    void delete(String id) throws SQLException;
    List getAll() throws SQLException;
}
