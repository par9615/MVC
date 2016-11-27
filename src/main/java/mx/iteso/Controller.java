package mx.iteso;

import mx.iteso.Model;
import mx.iteso.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by simio on 25/11/2016.
 */
public class Controller {
    Model model;
    View view;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
        this.setActionListeners();
    }


    public void setActionListeners(){
            view.helloButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.label.setText(model.hello());
                }
            });

            view.byeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.label.setText(model.goodBye());
                }
            });
    }
}
