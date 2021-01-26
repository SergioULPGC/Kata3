/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author delSe
 */

import kata3.core.HistogramDisplay;
import kata3.core.Histogram;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
    private HistogramDisplay histogramDisplay;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main().execute();
    }
    
    public Main(){
        setTitle("Histogram");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rootPane.setLayout(new BorderLayout());
        rootPane.add(createHistogramDisplay(), BorderLayout.CENTER);
    }
    
    private void execute(){
        Histogram histogram = new InternalHistogramLoader().load();
        histogramDisplay.display(histogram);
        setVisible(true);
    }
    
    private SwingHistogramDisplay createHistogramDisplay(){
        SwingHistogramDisplay display = new SwingHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }
}
