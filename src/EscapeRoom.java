import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {
    JPanel panel;
    JLabel situation, choice1, choice2, choice3, choice4, result;
    JButton option1, option2, option3, option4, next1, next2, next3, next4, next5, wrong1, wrong2, wrong3, wrong4;


    public static void main(String[] args) {
        new EscapeRoom();
    }

    public EscapeRoom() {
        JFrame frame = new JFrame("Escape!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        situation = new JLabel("You find yourself in a dimly lit room. You can see a bed, a door, a safe, and a sink.");
        choice1 = new JLabel("{1} - Interact with Bed");
        choice2 = new JLabel("{2} - Interact with Door");
        choice3 = new JLabel("{3} - Interact with Safe");
        choice4 = new JLabel("{4} - Interact with Sink");
        option1 = new JButton("1");
        option2 = new JButton("2");
        option3 = new JButton("3");
        option4 = new JButton("4");
        next1 = new JButton("1");
        next2 = new JButton("4");
        next3 = new JButton("1");
        next4 = new JButton("3");
        wrong1 = new JButton("1");
        wrong2 = new JButton("1");
        wrong3 = new JButton("1");
        wrong4 = new JButton("4");


        panel.add(situation);
        panel.add(choice1);
        panel.add(choice2);
        panel.add(choice3);
        panel.add(choice4);
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);
        panel.add(next1);
        panel.add(next2);
        panel.add(next3);
        panel.add(next4);
        panel.add(wrong1);
        panel.add(wrong2);
        panel.add(wrong3);
        panel.add(wrong4);


        situation.setBounds(65, 0, 600, 100);
        option1.setBounds(100, 220, 50, 30);
        option2.setBounds(200, 220, 50, 30);
        option3.setBounds(300, 220, 50, 30);
        option4.setBounds(400, 220, 50, 30);
        choice1.setBounds(75, 50, 600, 100);
        choice2.setBounds(75, 75, 600, 100);
        choice3.setBounds(75, 100, 600, 100);
        choice4.setBounds(75, 125, 600, 100);
        next1.setBounds(100, 220, 50, 30);
        next2.setBounds(400, 220, 50, 30);
        next3.setBounds(100, 220, 50, 30);
        wrong1.setBounds(100, 220, 50, 30);
        wrong2.setBounds(100, 220, 50, 30);
        wrong3.setBounds(100, 220, 50, 30);
        wrong4.setBounds(400, 220, 50, 30);

        option1.addActionListener(new bed1());
        next1.addActionListener(new knife());
        next2.addActionListener(new magnet());
        next3.addActionListener(new key());
        option2.addActionListener(new back1());
        option3.addActionListener(new back2());
        option4.addActionListener(new back3());
        wrong4.addActionListener(new back4());

        panel.setLayout(null);

        next1.setVisible(false);
        next2.setVisible(false);
        next3.setVisible(false);
        wrong3.setVisible(false);
        wrong2.setVisible(false);
        wrong1.setVisible(false);
        option1.setVisible(true);
        wrong4.setVisible(false);

        frame.add(panel);
        frame.setVisible(true);

    }

    class bed1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("You walk over to the bed and look under the mattress. You find a knife.");
            choice1.setText("{1} - Use knife on mattress");
            choice2.setText("");
            choice3.setText("");
            choice4.setText("");

            next1.setVisible(true);
            option1.setVisible(false);
            option2.setVisible(false);
            option3.setVisible(false);
            option4.setVisible(false);
        }

    }

    class knife implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("You use the knife on the mattress. You find a magnet");
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");

            option2.setVisible(true);
            option3.setVisible(true);
            option4.setVisible(false);
            next2.setVisible(true);

        }

    }

    class magnet implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("You stick the magnet down the drain. You bring back up a key.");
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");
            next1.setVisible(false);
            next3.setVisible(true);
            next2.setVisible(false);
            wrong4.setVisible(true);
        }

    }

    class key implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("You find a lockbox under the bed. The key worked! You picked up a code.");
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");

        }

    }

    class back1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("You try and turn the knob, it doesn't budge");
            situation.setBounds(65, 0, 600, 100);
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");


        }

    }

    class back2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            situation.setText("There's a dial on the safe. You have no idea what the code is.");
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");


        }

    }

    class back3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            situation.setText("You observe the sink, and there is something shiny in the drain however you cannot reach it");
            situation.setBounds(40, 0, 600, 100);
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");


        }

    }

    class back4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            situation.setText("Just a plain old sink now...");
            situation.setBounds(65, 0, 600, 100);
            choice1.setText("{1} - Interact with Bed");
            choice2.setText("{2} - Interact with Door");
            choice3.setText("{3} - Interact with Safe");
            choice4.setText("{4} - Interact with Sink");


        }

    }

}




