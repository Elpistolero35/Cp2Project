package Logic;

import projectv01.GUI.testingFrameCodes;
import projectv01.GUI.*;

import java.awt.*;
import javax.swing.*;



public class ProjectV01Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //MainPage frame = new testingFrameCodes();
        MainPage frame = new MainPage();
        // set the initially invisible testingFrameCodes to // visible - also from the Component class
        frame.setVisible(true);
    }


}