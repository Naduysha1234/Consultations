package MVPConsultation.backend;

import MVPConsultation.backend.entity.Consultation;
import MVPConsultation.util.Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

/**
 * Created by user on 09.02.2016.
 */
public class ConsultationManager {



    // Метод возвращает консультации для выбранных дней
    public Collection< ? extends Consultation> listConsultation (Date fromDate,Date toDate)
    {

        try (
                Connection con = BD.getConnection()
        ) {
            QueryRunner qr = new QueryRunner();
            String sql = "select * from consultations  between ? and ? order by date"; // создать таблицу и добавить туда данные
            String from = Util.getDate(fromDate);
            String to =  Util.getDate(toDate);
            Object[] params = new Object[]{from,to};
            BeanListHandler<Consultation> handler = new BeanListHandler<>(Consultation.class);
            return qr.query(con,sql, handler,params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    // Вставка будет происходит через форму Editform
    // Будет форма которая позволит добавлять консультации
    public int insertConsultation(Consultation consultation)

    {


        try (
                Connection con = BD.getConnection()
        ) {
            QueryRunner qr = new QueryRunner();
            String sql = "insert   ";
            String date = Util.getDate(consultation.getDate());
            Object[] params = new Object[]{consultation.getDate(),consultation.getLastNameDoctor(),consultation.getType(),consultation.getLastNamePatient()
                    ,consultation.getSex(),consultation.getTelephone(),consultation.getStatus()};
            int updateRows = qr.update(con, sql, params); // количество обновлевленных строчек
            return updateRows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }





}
