package GUI;




import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class testingFrameCodes extends JFrame {
    
    public testingFrameCodes() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Gym System");
        // or super ("This is my First testingFrameCodes"); 	

        setSize(screenSize.width, screenSize.height);
        //second option on the obove menu
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        //With this you can
        setLayout(new FlowLayout());

        // Display the frame
        setVisible(true);
    }
}
