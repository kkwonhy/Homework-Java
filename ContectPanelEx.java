package homework;

import javax.swing.*;
import java.awt.*;

public class ContectPanelEx extends JFrame {
	public ContectPanelEx() {
		setTitle("ContentPane과 Jframe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContectPanelEx();
	}

}
