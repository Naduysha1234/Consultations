package MVPConsultation.view;

/**
 * Created by user on 09.02.2016.
 */



import MVPConsultation.Presenter.ConsultationPresenter;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.Table;
 import com.vaadin.ui.*;
import com.vaadin.navigator.*;

public class ConsultationView extends CustomComponent implements  View {


    public final TreeTable treeTable;


    public ConsultationView(ConsultationPresenter consultationPresenter)
    {
        treeTable = new TreeTable("Расписание консультаций");
        treeTable.setWidth("100%");
        treeTable.setHeight("100%");
        treeTable.setSelectable(true);
        treeTable.setColumnCollapsingAllowed(true); //????
        treeTable.setColumnReorderingAllowed(true); // ??
        treeTable.setDragMode(Table.TableDragMode.ROW); // почитать
        treeTable.setContainerDataSource(); // добавить BeanItemContainerConsultation

        treeTable.setVisibleColumns("date","lastname","sex","caseHistoryNum","telephone","status");
        treeTable.setColumnHeader("date","Время");
        treeTable.setColumnHeader("lastname","Фамилия");
        treeTable.setColumnHeader("sex","Пол");
        treeTable.setColumnHeader("caseHistoryNum","Дело №");
        treeTable.setColumnHeader("telephone","Телефон");
        treeTable.setColumnHeader("status","Статус");



    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) { // для чего этот метод


    }
}
