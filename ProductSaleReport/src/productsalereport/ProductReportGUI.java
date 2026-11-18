/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalereport;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Student
 */
public class ProductReportGUI extends JFrame{
     
    private JTextArea txtDisplay;
    private JButton btnProcess;
    private JTextArea txtArea;
    
    private ProductReport productCalc = new ProductReport();
    
    public ProductReportGUI(){
        setTitle("Product App");
        setSize(450, 400);
        
        txtArea = new JTextArea();
        txtArea.setEditable(false);
        txtArea.setFont(new Font("Arial", Font.PLAIN,15));
        
        txtArea = new txtArea("Customer Name");
        scrollPane.setBounds(40, 150, 350, 150);
        panel.add(btnProcess);
        
        txtArea = new txtArea("Select Product");
        scrollPane.setBounds(40, 150, 350, 150);
        panel.add(btnProcess);
        
        txtArea = new txtArea("Enter price");
        scrollPane.setBounds(40, 150, 350, 150);
        panel.add(btnProcess);
        
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(40, 150, 350, 150);
        panel.add(btnProcess);
        
        btnProcess = new JButton("Process");
        btnProcess.setBounds(40, 20, 350, 35);
        panel.add(btnProcess);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenuItem processItem = new JMenuItem("Process");
        
        fileMenu.add(exitItem);
        
        toolsMenu.add(processItem);
        
        
        
    }
}
