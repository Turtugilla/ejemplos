/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timertest;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author CDIS Desarrollo de Talento
 */
public class TimerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();
        //construct a timer that calls the listener
        // once every 10 seconds
        
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);        
    }
    
}
