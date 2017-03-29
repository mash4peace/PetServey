package Mohamed.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by mash4 on 3/22/2017.
 */
public class PetServey extends JFrame {

    // Declaring
    private JPanel rootPanel;
    private JCheckBox dogcheckBox1;
    private JCheckBox catcheckBox1;
    private JCheckBox fishcheckBox1;
    private JLabel resultLable;
    private JButton quitbutton1;

    //The boolean variables
    private boolean dog, cat , fish;


    protected PetServey(){
        setContentPane(rootPanel); // Set the contents of the Window to the rootpanel Jpanel
        pack(); //Adds components to the window
        setSize(new Dimension( 350, 200)); //Size.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Close the program agter hitting the clsoe button
        setVisible(true); // Making it visible to the user!!!

        // ActionListener

        fishcheckBox1.addComponentListener(new ComponentAdapter() {
        });
        fishcheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fish = fishcheckBox1.isSelected();
                updateResults();


            }
        });
        catcheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = catcheckBox1.isSelected();
                updateResults();

            }

        });
        dogcheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dog = dogcheckBox1.isSelected();
                updateResults();
            }
        });


        quitbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quit = JOptionPane.showConfirmDialog(PetServey.this,
                        "Are you sure you want to quit ? ",
                        "Quit", JOptionPane.OK_CANCEL_OPTION);
                if(quit == JOptionPane.OK_OPTION){
                    System.exit(0);

                }


            }
        });
    }
    private  void updateResults(){
        String hasDog = dog? "one dog ": "no dog";
        String hasfsh = fish? "one fish ": "no fish";
        String hascat = cat? "one cat ": "no cat";

        /*
        The above  Tenery operators meannt
        if(dog == true){
            hasDog = "one dog"
           }

        else{
            hasDog = "no dog"

         */

        String results = "you have " + hasDog + " and " + hascat + " and " + hasfsh;
        resultLable.setText(results);

    }
}
