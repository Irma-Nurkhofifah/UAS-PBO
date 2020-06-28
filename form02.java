import java.sql.*;
import java.util.*;
import javax.swing.JTextField;

/**
 *
 * @author irrrma
 */
public abstract class form02 implements form01{

    static void delete(JTextField id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Form insert(Form FORM) throws SQLException {
        PreparedStatement st = connectionDB.getConnection().prepareStatement("insert into biodata values(?,?,?,?,?)");
        st.setString(1, FORM.getId());
        st.setString(2, FORM.getNama());
        st.setString(3, FORM.getAlamat());
        st.setString(4, FORM.getJk());
        st.setString(5, FORM.getEmail());
        st.executeUpdate();



        return FORM;
    }

    @Override
    public void update(Form FORM) throws SQLException {
        PreparedStatement st = connectionDB.getConnection().prepareStatement("update biodata set nama=?,alamat=?,jk=?,email=? where nomhs=?");

        st.setString(1, FORM.getNama());
        st.setString(3, FORM.getAlamat());
        st.setString(4, FORM.getJk());
        st.setString(5, FORM.getEmail());
        st.setString(3, FORM.getId());
        st.executeUpdate();

    }
    
    public void delete(int id) throws SQLException {
        PreparedStatement st = connectionDB.getConnection().prepareStatement("delete from biodata where id=?");
        st.setInt(1, id);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = connectionDB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from biodata");
        List list = new ArrayList();
        while (rs.next()) {
            Form p = new Form();
            p.setId(rs.getString("id"));
            p.setNama(rs.getString("nama"));
            p.setAlamat(rs.getString("alamat"));
            p.setJk(rs.getString("jk"));
            p.setEmail(rs.getString("email"));
            list.add(p);
        }
        return list;
    }
    
}
