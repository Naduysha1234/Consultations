package MVPConsultation.backend.entity;

/**
 * Created by user on 09.02.2016.
 */

import java.util.Date;
public class Schedule {

    public Date date;
    public  String lastName; //  фамилия врача
    private String radiosurgery;
    private String ochnoeForm;
    private String zaochnoeForm;
    private String oncology;

    public  void setDate (Date date) {
        this.date = date;
    }


    public Date getDate ()
    {
        return date;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRadiosurgery() {
        return radiosurgery;
    }

    public void setRadiosurgery(String radiosurgery) {
        this.radiosurgery = radiosurgery;
    }

    public String getOchnoe() {
        return ochnoeForm;
    }

    public void setOchnoe(String ochnoeForm) {
        this.ochnoeForm = ochnoeForm;
    }

    public String getZaochnoe() {
        return zaochnoeForm;
    }

    public void setZaochnoe(String zaochnoeForm) {
        this.zaochnoeForm = zaochnoeForm;
    }

    public String getOncology() {
        return oncology;
    }

    public void setOncology(String oncology) {
        this.oncology = oncology;
    }
}



