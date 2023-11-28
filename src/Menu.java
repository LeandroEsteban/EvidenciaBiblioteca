import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton agregarMaterialButton;

    public Menu() {
        agregarMaterialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMaterial newframe = new VentanaMaterial();
                newframe.setVisible(true);
            }
        });
    }
}
