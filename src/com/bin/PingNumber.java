package com.bin;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("PingNumber");
	}

}

class MyFrame extends Frame {

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;

	public MyFrame(String s) {

		super(s);
		this.setBounds(200, 100, WIDTH, HEIGHT);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("窗口关闭");
				System.exit(0);
			}
		});
		this.setVisible(true);
		this.setBackground(Color.red);

		Label lab1 = new Label("Input eight number:");
//		lab1.setBounds(100, 100, 100, 60);
		this.add(lab1);
	}
}