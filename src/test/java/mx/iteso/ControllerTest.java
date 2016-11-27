package mx.iteso;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.awt.event.ActionListener;

import static org.mockito.Mockito.*;

/**
 * Created by simio on 26/11/2016.
 */
public class ControllerTest {
    View view;
    Controller controller;
    Model model;

    @Before
    public void setUp(){
        view = new View();
        model = new Model();
        controller = new Controller(model, view);

    }

    @Test
    public void helloTest(){
        view.helloButton.doClick();
        Assert.assertEquals("Hello", view.label.getText());
    }


    @Test
    public void byeTest(){
        view.byeButton.doClick();
        Assert.assertEquals("Good bye", view.label.getText());
    }

    
}
