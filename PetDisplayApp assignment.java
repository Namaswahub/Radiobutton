import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetDisplayApp extends JFrame implements ActionListener {
    private JLabel petLabel;
    private JRadioButton dogButton;
    private JRadioButton catButton;
    private JRadioButton birdButton;
    private JRadioButton fishButton;
    private JRadioButton doveButton;

    public PetDisplayApp() {
        setTitle("Pet Display App");
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        petLabel = new JLabel();
        panel.add(petLabel);

        dogButton = new JRadioButton("Dog");
        dogButton.addActionListener(this);
        panel.add(dogButton);

        catButton = new JRadioButton("Cat");
        catButton.addActionListener(this);
        panel.add(catButton);

        birdButton = new JRadioButton("Bird");
        birdButton.addActionListener(this);
        panel.add(birdButton);

        fishButton = new JRadioButton("Fish");
        fishButton.addActionListener(this);
        panel.add(fishButton);

        doveButton = new JRadioButton("dove");
        doveButton.addActionListener(this);
        panel.add(doveButton);

        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(dogButton);
        petGroup.add(catButton);
        petGroup.add(birdButton);
        petGroup.add(fishButton);
        petGroup.add(doveButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (dogButton.isSelected()) {
            petLabel.setText("Dog");
        } else if (catButton.isSelected()) {
            petLabel.setText("Cat");
        } else if (birdButton.isSelected()) {
            petLabel.setText("Bird");
        } else if (fishButton.isSelected()) {
            petLabel.setText("Fish");
        } else if (doveButton.isSelected()) {
            petLabel.setText("dove");
        }
    }

    public static void main(String[] args) {
        new PetDisplayApp();
    }
}