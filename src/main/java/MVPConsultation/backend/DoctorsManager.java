package MVPConsultation.backend;

import MVPConsultation.backend.entity.Doctor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by user on 09.02.2016.
 */
public class DoctorsManager {



    public Collection< ? extends  Doctor> listDoctors() {
        try (
                Connection con = BD.getConnection()
        ) {
            QueryRunner qr = new QueryRunner();
            BeanListHandler<Doctor> handler = new BeanListHandler<>(Doctor.class);
            return qr.query(con,"select * from ", handler); // найдет фамилии доступных врачей
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
