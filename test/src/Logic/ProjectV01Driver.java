package Logic;

import GUI.MainPage;
import GUI.testingFrameCodes;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;



public class ProjectV01Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        //MainPage frame = new testingFrameCodes();
        MainPage frame = new MainPage();
        // set the initially invisible testingFrameCodes to // visible - also from the Component class
        frame.setVisible(true);
    }


}
