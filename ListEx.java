package homework;

import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame {
	private String[] fruits = {};
	private ImageIcon[] images = {};
	private Container c = new Container();

	public ListEx() {
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);

		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);

		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
	}

	public static void main(String[] arge) {
		new ListEx();
	}
}
