/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

/**
 *
 * @author emmro
 */
//import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ListExample extends JPanel{
    private BookEntry books[]={
        new BookEntry("Ant: the Definitive Guide","covers/ant.png"),
        new BookEntry("Database Programming with JDBC and Java","covers/jdbc.png"),
        new BookEntry("Developing Java Beans","covers/beans.png"),
        new BookEntry("Developing JSP Custom Tag Libreries","covers/jspt1.png"),
        new BookEntry("Java 2D Graphics","covers/java2d.png"),
        new BookEntry("Java and XML","covers/jxml.png"),
        new BookEntry("Java and XSLT","covers/jxslt.png"),
        new BookEntry("Java and SOAP","covers/jsoap.png"),
        new BookEntry("Java and XML Data Binding","covers/jxml.png"),
        new BookEntry("Java Cookbook","covers/jcook.png"),
        new BookEntry("Java Cryptography","covers/jcrypto.png"),
        new BookEntry("Java Distributed Computing","covers/jdist.png"),
        new BookEntry("Java I/O","covers/javaio.png"),
        new BookEntry("Java in a Nutshell","covers/javanut.png"),
        new BookEntry("Java Management Extensions","covers/jmx.png"),
        new BookEntry("Java Message Service","covers/jms.png"),
        new BookEntry("Java Network Programming","covers/jnetp.png"),
        new BookEntry("Java Performance Tuning","covers/jperf.png"),
        new BookEntry("Java RMI","covers/jrmi.png"),
        new BookEntry("Java Security","covers/jsec.png"),
        new BookEntry("JavaServer Pages","covers/jsp.png"),
        new BookEntry("Java Servlet Programming","covers/servlet.png"),
        new BookEntry("Java Swing","covers/swing.png"),
        new BookEntry("Java Threads","covers/jthread.png"),
        new BookEntry("Java Web Services","covers/jws.png"),
        new BookEntry("Learning Java","covers/learnj.png"),
    };
    private JList booklist= new JList(books);
    public ListExample(){
        setLayout(new BorderLayout());
        JButton button=new JButton("Print");
        button.addActionListener(new PrintListener());        
        booklist=new JList(books);
        booklist.setCellRenderer(new BookCellRenderer());
        booklist.setVisibleRowCount(4);
        JScrollPane pane =new JScrollPane(booklist);
        add(pane,BorderLayout.NORTH);
        add(button,BorderLayout.SOUTH);
    }
    public static void main(String s[]){
        JFrame frame=new JFrame("List Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new ListExample());
        frame.pack();
        frame.setVisible(true);
    }
    //An inner class to respond to click of the Print button 
    class PrintListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int selected[]=booklist.getSelectedIndices();
            System.out.println("selected Elements: ");
            for(int i= 0;i<selected.length;i++){
                BookEntry element=(BookEntry)booklist.getModel().getElementAt(selected[i]);
                System.out.println(" "+ element.getTitle());
            }
        }
    }
}

