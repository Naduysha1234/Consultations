package MVPConsultation.Presenter;

import MVPConsultation.backend.ConsultationManager;
import MVPConsultation.model.ConsultationModel;
import java.util.Date;

import MVPConsultation.view.ConsultationView;
import com.vaadin.event.Action;
import com.vaadin.ui.Button;
/**
 * Created by user on 09.02.2016.
 */

public class ConsultationPresenter  implements Action.Handler, Button.ClickListener{


    private ConsultationModel consultationModel;

    private ConsultationManager consultationManager;

    private ConsultationView view;

    public ConsultationPresenter(ConsultationView view, ConsultationManager consultationManager)
    {
        consultationModel = new ConsultationModel();
        this.view = view;
        this.consultationManager = consultationManager;

    }


    public void start()
    {
       consultationModel.consultationBeanItemContainer.addAll(consultationManager.listConsultation(new Date(),)); // добавляются данные в BeanItemContainer в пределнных числах
       // как быть с датами
       // Показываем 7 дней
        for (int i=0; i< 7 ;i++)
        {

        }



    }


    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {

    }

    @Override
    public Action[] getActions(Object o, Object o1) {  // прочитать метод что он делает
        return new Action[0];
    }

    @Override
    public void handleAction(Action action, Object o, Object o1) { // прочитать  метод что он делает

    }
}
