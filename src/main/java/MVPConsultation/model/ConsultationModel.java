package MVPConsultation.model;

import MVPConsultation.backend.entity.Consultation;
import MVPConsultation.backend.entity.Doctor;
import MVPConsultation.backend.entity.Schedule;
import com.vaadin.data.util.BeanItemContainer;

/**
 * Created by user on 09.02.2016.
 */
public class ConsultationModel {


    public final BeanItemContainer<Doctor> doctorBeanItemContainer = new BeanItemContainer<>(Doctor.class);

    public final BeanItemContainer<Schedule> scheduleBeanItemContainer = new BeanItemContainer<>(Schedule.class);

    public final BeanItemContainer<Consultation>  consultationBeanItemContainer = new BeanItemContainer<>(Consultation.class);


    // получаем контейнеры
    public BeanItemContainer<Consultation> getConsultationContainer() {
        return consultationBeanItemContainer;
    }

    public BeanItemContainer<Schedule> getScheduleBeanItemContainer() {
        return scheduleBeanItemContainer;
    }


    public BeanItemContainer<Doctor> getDoctorBeanItemContainer() {
        return doctorBeanItemContainer;
    }


}
