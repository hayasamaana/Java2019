import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener,MouseListener {
	private JTextField t1,t2;
	private JLabel l1;
	private JButton b;
	public JCheckBox cb;
	public MyPanel() {
		// TODO Auto-generated constructor stub
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel();
		Icon ic=new ImageIcon(getClass().getResource("index.png"));
		b=new JButton("add",ic);
		l1.setText("0");
		cb=new JCheckBox("Male");
		add(cb);
		add(t1);
		add(t2);
		add(l1);
		add(b);
		
		t1.addActionListener(this);
		b.addActionListener(this);
		//t2.addMouseListener(this);
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.BLUE);
		 if(e.getSource()==t2) {
			t2.setForeground(Color.GREEN);
			t2.setBackground(Color.BLACK);
			
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.cyan);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==t1) {
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int num3=num1+num2;
			l1.setText(""+num3);
		}
		else if(e.getSource()==b) {
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int num3=num1+num2;
			l1.setText(""+num3);
			b.setBackground(Color.yellow);
		}
		
	}

}


