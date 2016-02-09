package MVPConsultation;

/**
 * Created by user on 09.02.2016.
 */

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;


@Theme("mytheme")
@Widgetset("MVPConsultation.MyAppWidgetset")
public class App extends  UI {

    @Override
    protected void init(VaadinRequest vaadinRequest)
    {



    }


    @WebServlet(urlPatterns = "/*", name = "AppServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = App.class, productionMode = false)
    public static class AppServlet extends VaadinServlet {
    }
}
