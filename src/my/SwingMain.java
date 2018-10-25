package my;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SwingMain {

	public static void main(String[] args) {
		JFrame jf = new JFrame("≤‚ ‘");
		jf.setSize(600, 400);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		JButton jb = new JButton("Button");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("clicked");
			}
		});
		
		jp.add(jb);
		jf.add(jp);
		
		jf.setVisible(true);
	}
}
