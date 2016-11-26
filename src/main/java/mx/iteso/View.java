import javax.swing.*;
import java.awt.*;

/**
 * Created by simio on 25/11/2016.
 */
public class View{
    JFrame frame;
    JPanel panel;
    JButton helloButton;
    JButton byeButton;
    JLabel label;

    public View(){
        frame = new JFrame("MVC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);


        panel = new JPanel(new GridLayout(3,1));

        helloButton = new JButton("Say hello");
        byeButton = new JButton("Say good bye");
        label = new JLabel("Nothing", SwingConstants.CENTER);


        panel.add(helloButton);
        panel.add(byeButton);
        panel.add(label);

        frame.add(panel,0);

    }


}
