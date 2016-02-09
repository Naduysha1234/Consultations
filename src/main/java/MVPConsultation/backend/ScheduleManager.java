package MVPConsultation.backend;

import MVPConsultation.backend.entity.Schedule;
import MVPConsultation.util.Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
/**
 * Created by user on 09.02.2016.
 */

public class ScheduleManager {



    // Метод возвращает список дней, которые мы хотим выбрать
    public List<Schedule> listSchedule(Date fromDate,Date toDate)
    {

        try (
                Connection con = BD.getConnection()
        ) {
            QueryRunner qr = new QueryRunner();
            String sql = "select * from ( таблица расписаний врачей) where date between ? and ? order by date";
            String from = Util.getDate(fromDate);
            String to =   Util.getDate(toDate);
            Object[] params = new Object[]{from,to};
            BeanListHandler<Schedule> handler = new BeanListHandler<>(Schedule.class);
            return qr.query(con,sql,handler,params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    // Метод который добавляет данные для определенного дня : врача и форму.
    // Будет ФОРМА которая позволит добавлять существующих врачей из таблицы Doctors
    public int insertSchedule(Schedule schedule)
    {

        try (
                Connection con = BD.getConnection()
        )

        {
            QueryRunner qr = new QueryRunner();
            String sql = "insert into (таблица) () values(?,?,?,?,?,?,?)"; // таблица scheduledoctors
            Object[] params = new Object[] {schedule.getDate(),schedule.getLastName(),schedule.getRadiosurgery(),schedule.getOchnoe(),schedule.getZaochnoe(),schedule.getOncology()};
             int updateRows = qr.update(con,sql, params);// количество обновленных строк
            return updateRows;

        }

        catch (SQLException e) {
        throw new RuntimeException(e);
    }





    }

}
