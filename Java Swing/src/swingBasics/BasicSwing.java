package swingBasics;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicSwing extends JFrame {
	
	// https://www.youtube.com/watch?v=ZDw18yUwz6I&list=WL&index=6

	JPanel p = new JPanel();
	JButton b = new JButton("Hallo");
	JTextArea ta = new JTextArea("Hello\nJTextArea", 10, 15);
	JTextField t = new JTextField("This\nis\nJTextField", 20);
	String[] cbParametar = { "Hellou ComboBox", "BonojurComboBox",
			"Bok ComboBox!" };
	JComboBox cb = new JComboBox(cbParametar);
	JLabel l = new JLabel("This is label");

	public BasicSwing() {
		super("Basic Swing app");

		setSize(500, 400);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p.add(b);
		p.add(ta);
		p.add(t);
		p.add(cb);
		p.add(l);
		add(p);
	}

	public static void main(String[] args) {

		new BasicSwing();
	}

}
