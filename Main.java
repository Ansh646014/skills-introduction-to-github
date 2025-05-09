package NOTEPAD.src;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;


public class Main extends JFrame{
    JTextArea area;
    Main() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

       //text area
        JTextArea area= new JTextArea();
        area.setFont(new Font("Arial", Font.PLAIN, 24));  // Set the font for the text area
        area.setLineWrap(true);  // Allow line wrapping
        area.setWrapStyleWord(true);  // Wrap lines at word boundaries
        area.setCaretPosition(0);  // Set the caret at the start of the text area

        JScrollPane scrollPane = new JScrollPane(area);
        add(scrollPane, BorderLayout.CENTER);


       UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());


        JMenuBar menu= new JMenuBar();
        JMenu FILE= new JMenu("FILE");
        JMenu EDIT= new JMenu("EDIT");
        JMenu VIEW= new JMenu("VIEW");
        JMenu ABOUT = new JMenu("ABOUT");
        menu.add(FILE);
        menu.add(EDIT);
        menu.add(VIEW);
        menu.add(ABOUT);
        setJMenuBar(menu);
        menu.setBackground(Color.white);






        String tittle= "NOTEPAD";
        setTitle(tittle);

        FILE.setFont(new Font("Algerian",Font.PLAIN,14));
        EDIT.setFont(new Font("Algerian",Font.PLAIN,14));
        VIEW.setFont(new Font("Algerian",Font.PLAIN,14));
        ABOUT.setFont(new Font("Algerian",Font.PLAIN,14));
        JMenuItem FILEITEM= new JMenuItem("NEW");
        FILEITEM.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        FILEITEM.addActionListener(this::actionperfrom);

        JMenuItem FILEITEM2= new JMenuItem("SAVE");
        FILEITEM2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        JMenuItem FILEITEM3= new JMenuItem("PRINT");
        FILEITEM3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        JMenuItem FILEITEM4= new JMenuItem("EXIT");
        FILEITEM4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));

        FILEITEM.setFont(new Font("Algerian",Font.PLAIN,14));
        FILE.add(FILEITEM);
        FILE.add(FILEITEM2);
        FILE.add(FILEITEM3);
        FILE.add(FILEITEM4);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);


        JMenuItem EDIT1= new JMenuItem("copy");
        EDIT1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));

        JMenuItem EDIT2= new JMenuItem("paste");
        EDIT2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        JMenuItem EDIT3=new JMenuItem("cut");
        EDIT3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));


        JMenuItem EDIT4= new JMenuItem("select all");
        EDIT4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        EDIT.add(EDIT1);
        EDIT.add(EDIT2);
        EDIT.add(EDIT3);
        EDIT.add(EDIT4);

        JMenuItem zoomin= new JMenuItem("zoomin");
        VIEW.add(zoomin);

        JMenuItem about= new JMenuItem("about notepad");
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        ABOUT.add(about);





        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setVisible(true);

        ImageIcon NP=new ImageIcon("E:/java basic/src/NOTEPAD/ICONS/images.png");
        Image icon= NP.getImage();
        setIconImage(icon);







    }

    //performing action


    public void actionperfrom(ActionEvent ae){


    }
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        new Main();
    }


}