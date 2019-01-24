import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame  {

	
	 public JTextField T1;
	
	 public MyFrame() {
		setLayout(new FlowLayout());
		T1=new JTextField("Hi",30);
		add(T1);
		T1.addActionListener(new Handler());
		
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
	private class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, T1.getText());
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f=new MyFrame();

	}

}
