package MVPConsultation.backend.entity;

/**
 * Created by user on 09.02.2016.
 */

import java.util.*;
public class Consultation {

    public Date date;
    public String lastNameDoctor;
    public String lastNamePatient;
    public String telephone;
    public String status;
    public String sex;
    public String type;

    public String getLastNameDoctor() {
        return lastNameDoctor ;
    }

    public void setLastNameDoctor(String lastNameDoctor) {
        this.lastNameDoctor = lastNameDoctor;
    }

    public String getLastNamePatient() {
        return lastNamePatient;
    }

    public void setLastNamePatient(String lastNamePatient) {
        this.lastNamePatient = lastNamePatient;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {

        return " ";

    }

}
