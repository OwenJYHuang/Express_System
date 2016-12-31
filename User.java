package gui;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import javax.swing.JTextField;
import java.awt.event.*;
import com.Express.*;


public class User {
	public JFrame frame;
	Date now = new Date();
	Express temp=new Express();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	public String hehe = dateFormat.format( now );  
	private JTextField textField;
	public  JPanel GImage = null;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	*/

	/**
	 * Create the application.
	 */
	public User() {
		initialize();
	}

	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	
				
		frame.setBounds(400, 200, 450, 400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel();

			
		ImageIcon bg=new ImageIcon("images//userbackground.jpg");
		JLabel label_bg = new JLabel(bg);
		label_bg.setIcon(bg);
		label_bg.setLayout(new BorderLayout());
		label_bg.add(label,BorderLayout.CENTER);
		label_bg.setSize(450,400);//              ������С

		
//		frame.getContentPane().add(label_bg,new Integer(Integer.MIN_VALUE));
		frame.getLayeredPane().add(label_bg,new Integer(Integer.MIN_VALUE));
		 JPanel jp=(JPanel)frame.getContentPane();
		 jp.setOpaque(false);//����͸��
		
		label.setBounds(116, 0, 217, 21);
		frame.getContentPane().add(label);
		label.setText("�𾴵��û�����ӭ��½��������ϵͳ");
		
		
		//
		JButton button = new JButton("�鿴�ҵ�������Ϣ");
		button.setBounds(10, 55, 129, 23);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label_1 = new JLabel();
				label_1.setBounds(10, 103, 108, 21);
				frame.getContentPane().add(label_1);
				label_1.setText("�������ݵ��ţ�");
				
				
				textField = new JTextField();
				textField.setBounds(121, 103, 212, 21);
				frame.getContentPane().add(textField);
				textField.setColumns(10);
				
				
				JButton button_1 = new JButton("��ѯ");
				button_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						JTextArea textArea = new JTextArea();
						textArea.setBounds(121, 140, 212, 140);
						frame.getContentPane().add(textArea);
						textArea.setColumns(10);
						try {
							textArea.setText(temp.Read_Express(Integer.parseInt(textField.getText())));
						} catch (NumberFormatException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
						frame.repaint();
					}
				});
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_1.setBounds(343, 102, 81, 23);
				frame.getContentPane().add(button_1);
				frame.repaint();
				
			}
		});
		
		
		JLabel label_2 = new JLabel();
		label_2.setText("��½ʱ�䣺"+hehe);
		label_2.setBounds(192, 319, 232, 21);
		frame.getContentPane().add(label_2);//��ʾ��ǰʱ��
		
		/*
		JLabel label_1 = new JLabel();
		label_1.setBounds(10, 103, 108, 21);
		frame.getContentPane().add(label_1);
		label_1.setText("���������ݵ��ţ�");
		
		
		textField = new JTextField();
		textField.setBounds(121, 103, 212, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("��ѯ");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ѯ�ɹ�");
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(343, 102, 81, 23);
		frame.getContentPane().add(button_1);
	*/
	}

}
