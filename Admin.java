package gui;

import javax.imageio.*;
import javax.swing.*;

import java.util.*;
import java.text.*;
import java.awt.*;
import java.io.*;
import java.util.Timer;  
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent; 
import com.Express.*;


public class Admin {
	public JFrame frame;
	private JTable table;
	private JTextArea textArea;
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String hehe = dateFormat.format( now ); 
	Express temp=new Express();
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private JPanel imagePanel;
	private ImageIcon background;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JTextArea textArea_5;
	private JTextArea textArea_6;
	private JTextArea textArea_7;
	private JTextArea textArea_8;
	
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final JLabel label_2 = new JLabel();
		label_2.setBounds(0, 137, 442, 50);
		label_2.setFont(new Font("楷体", Font.PLAIN, 35));
		label_2.setText("请填写物流信息：");
		final JLabel label_21 = new JLabel();
		label_21.setBounds(0, 203, 200, 50);
		label_21.setFont(new Font("楷体", Font.PLAIN, 30));
		label_21.setText("起始地：");
		final JLabel label_22 = new JLabel();
		label_22.setBounds(0, 279, 200, 50);
		label_22.setFont(new Font("楷体", Font.PLAIN, 30));
		label_22.setText("目的地：");
		final JLabel label_23 = new JLabel();
		label_23.setBounds(0, 348, 200, 50);
		label_23.setFont(new Font("楷体", Font.PLAIN, 30));
		label_23.setText("发件人：");
		final JLabel label_24 = new JLabel();
		label_24.setBounds(0, 413, 200, 50);
		label_24.setFont(new Font("楷体", Font.PLAIN, 30));
		label_24.setText("收件人：");
		
		final JTextArea textArea_del = new JTextArea();
		textArea_del.setBounds(530, 203, 236, 50);
		
		final JTextArea textArea_0 = new JTextArea();
		textArea_0.setBounds(530, 203, 236, 200);
		
		final JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(165, 203, 236, 50);
		
		final JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(165, 279, 236, 50);
		
		final JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(165, 348, 236, 50);
		
		final JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(165, 413, 236, 50);
		
		
		
		
		
		final JLabel label_4 = new JLabel("请输入快递单号：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 27));
		label_4.setBounds(0, 149, 238, 50);
		

		
		textArea_4 = new JTextArea();
		textArea_4.setBounds(199, 149, 538, 50);
		textArea_4.setColumns(10);
		textArea_4.getText();
		
		final JButton button_4 = new JButton("确定");
		button_4.setFont(new Font("宋体", Font.PLAIN, 22));
		button_4.setBounds(747, 149, 115, 50);
		
		final JButton button_5 = new JButton("确定");
		button_5.setFont(new Font("宋体", Font.PLAIN, 22));
		button_5.setBounds(600, 420, 115, 50);
		button_5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				try {
					textArea_0.setText(temp.Creat_Express(textArea_8.getText(),textArea_6.getText(),textArea_5.getText(),textArea_7.getText()));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		
		
		final JButton button_6 = new JButton("确定");
		button_6.setFont(new Font("宋体", Font.PLAIN, 22));
		button_6.setBounds(600, 300, 115, 50);
		button_6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				try {
					textArea_del.setText(temp.Delete_Express(Integer.parseInt(textArea_del.getText())));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		final JLabel label_3 = new JLabel();
		label_3.setBounds(50, 137, 800, 50);
		label_3.setText("  显示当前货物信息为：                      输入快递单号以删除过期信息:");
		label_3.setFont(new Font("楷体", Font.PLAIN, 21));
		textArea_2 = new JTextArea();
		textArea_2.setBounds(43, 178, 442, 326);
		for(int i=1;i<100;i++)
			try {
				textArea_2.setText(textArea_2.getText()+temp.Read_All_Express(i));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		textArea_2.setColumns(10);
		
		
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(199, 220, 538, 140);


final JLabel label_l = new JLabel("请输入目前位置：");
		label_l.setFont(new Font("宋体", Font.PLAIN, 27));
		label_l.setBounds(0, 375, 238, 50);

final JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(199, 375, 538, 40);
		textArea2.setColumns(10);

final JButton button_l = new JButton("修改");
		button_l.setFont(new Font("宋体", Font.PLAIN, 22));
		button_l.setBounds(747, 375, 115, 50);
		
		
		
		
		JButton button = new JButton("新建物流");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("宋体", Font.PLAIN, 26));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(textArea_2);
				frame.remove(textArea_4);
				frame.remove(button_4);
				frame.remove(label_4);
				frame.remove(label_3);
				frame.remove(textArea_2);
				frame.remove(textArea_del);
				frame.remove(button_6);
				frame.remove(button_l);
				frame.remove(textArea);
				frame.remove(label_l);
				frame.remove(textArea2);
				frame.repaint();
				
				frame.getContentPane().add(button_5);
				frame.getContentPane().add(label_2);
				frame.getContentPane().add(label_21);
				frame.getContentPane().add(label_22);
				frame.getContentPane().add(label_23);
				frame.getContentPane().add(label_24);
				frame.getContentPane().add(textArea_5);
				frame.getContentPane().add(textArea_6);
				frame.getContentPane().add(textArea_7);
				frame.getContentPane().add(textArea_8);
				frame.getContentPane().add(textArea_0);
				frame.remove(textArea_4);
				frame.remove(button_4);
				frame.remove(label_4);
				frame.repaint();
			}
		});
		button.setBounds(0, 79, 169, 50);
		frame.getContentPane().add(button);

		
		
		
		JButton button_1 = new JButton("货物信息");
		button_1.setFont(new Font("宋体", Font.PLAIN, 26));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(textArea_2);
				frame.remove(textArea_4);
				frame.remove(textArea_0);
				frame.remove(button_4);
				frame.remove(label_4);
				frame.remove(button_5);
				frame.remove(label_2);
				frame.remove(label_21);
				frame.remove(label_22);
				frame.remove(label_23);
				frame.remove(label_24);
				frame.remove(textArea_2);
				frame.remove(button_5);
				frame.remove(label_2);
				frame.remove(label_21);
				frame.remove(label_22);
				frame.remove(label_23);
				frame.remove(label_24);
				frame.remove(textArea_5);
				frame.remove(textArea_6);
				frame.remove(textArea_7);
				frame.remove(textArea_8);
				frame.remove(textArea_0);
				frame.remove(textArea_4);
				frame.remove(button_4);
				frame.remove(label_4);
				frame.remove(button_l);
				frame.remove(textArea);
				frame.remove(label_l);
				frame.remove(textArea2);
				frame.repaint();
				frame.getContentPane().add(label_3);
				frame.getContentPane().add(textArea_2);
				frame.getContentPane().add(textArea_del);
				frame.getContentPane().add(button_6);
				frame.repaint();
			}
		});
		button_1.setBounds(199, 79, 187, 50);
		frame.getContentPane().add(button_1);
		
		
		
		button_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				frame.getContentPane().add(textArea);  //输出快递的信息
				try {
					textArea.setText(temp.Read_Express(Integer.parseInt(textArea_4.getText())));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setColumns(10);
				

				frame.getContentPane().add(label_l); 
				
				
				frame.getContentPane().add(textArea2);  //输入快递的当前位置
				
				
				
				frame.getContentPane().add(button_l); 
				button_l.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						//这里输入“修改”按钮的触发事件
						try {
							 //修改地址
							textArea2.setText(temp.Change_Location(Integer.parseInt(textArea_4.getText()),textArea2.getText()));
							
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
				
				frame.repaint();
			}
		});
		
		
		JButton button_2 = new JButton("更新快递信息");
		button_2.setFont(new Font("宋体", Font.PLAIN, 26));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(label_3);
				frame.remove(textArea_5);
				frame.remove(textArea_6);
				frame.remove(textArea_7);
				frame.remove(textArea_8);
				frame.remove(textArea_0);
				frame.remove(button_4);
				frame.remove(label_4);
				frame.remove(button_5);
				frame.remove(label_2);
				frame.remove(label_21);
				frame.remove(label_22);
				frame.remove(label_23);
				frame.remove(label_24);
				frame.remove(textArea_2);
				frame.remove(button_5);
				frame.remove(label_2);
				frame.remove(label_21);
				frame.remove(label_22);
				frame.remove(label_23);
				frame.remove(label_24);
				frame.remove(textArea_5);
				frame.remove(textArea_6);
				frame.remove(textArea_7);
				frame.remove(textArea_8);
				frame.remove(textArea_0);
				frame.remove(label_3);
				frame.remove(textArea_2);
				frame.remove(textArea_del);
				frame.remove(button_6);
				frame.repaint();
				frame.getContentPane().add(textArea_4);
				frame.getContentPane().add(button_4);
				frame.getContentPane().add(label_4);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBounds(405, 79, 291, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("退出");
		button_3.setFont(new Font("宋体", Font.PLAIN, 26));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_3.setBounds(706, 79, 177, 50);
		frame.getContentPane().add(button_3);
		
		JLabel label = new JLabel();
		label.setFont(new Font("宋体", Font.PLAIN, 36));
		label.setBounds(259, 10, 400, 58);
		frame.getContentPane().add(label);
		label.setText("欢迎登录物流管理系统");
		
		JLabel label_1 = new JLabel();
		label_1.setFont(new Font("宋体", Font.PLAIN, 29));
		label_1.setText("登录时间："+hehe);
		label_1.setBounds(401, 501, 473, 50);
		frame.getContentPane().add(label_1);
			

	}


}
