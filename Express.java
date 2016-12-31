package com.Express;

import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
public class Express{
	int ExpressNumber;
	String Receiver;
	String Destination;
	String DepaturePlace;
	String Sender;
	String Note;

	public String Creat_Express(String Receiver,String Destination,String DepaturePlace,String Sender)throws IOException{
		int newNumber;
		FileWriter fout = new FileWriter(".\\ExpressData.txt",true);//��׷�ӵ���ʽд��
		BufferedWriter bout=new BufferedWriter(fout);
		ExpressNumber=1+(int)(Math.random()*100);
		newNumber=ExpressNumber;
		bout.write(String.valueOf(ExpressNumber)+"	");
		bout.write(Sender+"	");
		bout.write(Receiver+"	");
		bout.write(DepaturePlace+"	");
		bout.write(Destination);
		bout.write("\r\n");
		bout.write(newNumber+"00"+"   "+DepaturePlace);
		bout.write("\r\n");
	
		//System.out.println("�����Ϣ��¼��");
		bout.close();
		return "�����Ϣ��¼��\r\n���Ŀ�ݵ�����:"+newNumber;
		
	}



	public String Read_Express(int Number) throws IOException{

	String str;
	int flag=0;
	FileReader fin=new FileReader(".\\ExpressData.txt");
	BufferedReader bin=new BufferedReader(fin);
	//ExpressNumber=Integer.parseInt(br.readLine());
	ExpressNumber=Number;
	while((str=bin.readLine())!=null)
		if(ExpressNumber==Integer.parseInt(str.substring(0, 2)))
			{
			flag=1;
			return "����:	  �ļ���:	������:	������:	Ŀ�ĵ�:"+"\r\n"+str+"\r\n"+"	��ǰλ��:"+"\r\n	"+bin.readLine().substring(7);
			}
	if(flag!=1)
		return "δ��ѯ�����";	
	bin.close();
	return "";
	
	}
	
	public  String Delete_Express(int Number) throws IOException {
			String str="";
			int flag=0;
			FileReader fin=new FileReader(".\\ExpressData.txt");
			BufferedReader bin=new BufferedReader(fin);
			ArrayList<String> list = new ArrayList<String>();
			ExpressNumber=Number;
			while((str=bin.readLine())!=null){
				if(ExpressNumber!=Integer.parseInt(str.substring(0, 2)))
				list.add(str);				 //��list��ʱ������Ϣ��д�룬�ﵽɾ����Ŀ��
				else
				flag=1;
					}
			
			
			//�����Ƶ��ļ�����Ϊ���ļ�
			 FileWriter fout = new FileWriter(".\\ExpressData.txt");
				BufferedWriter bout=new BufferedWriter(fout);
			for(int i=0;i<list.size();i++)
			{bout.write(String.valueOf(list.get(i)));
			bout.write("\r\n");}
			bin.close();
			bout.close();
			if(flag==1){
				return "�ѳɹ�ɾ����";
			}
			if(flag!=1)
				return "δ��ѯ�����";
			return "";
	}
	
	public  String Change_Location(int Number,String Destination) throws IOException {
			String str="";
			int flag=0;
			FileReader fin=new FileReader(".\\ExpressData.txt");
			BufferedReader bin=new BufferedReader(fin);
			ArrayList<String> list = new ArrayList<String>();
			ExpressNumber=Number;
			while((str=bin.readLine())!=null){
				if(str.charAt(3)!='0'){
				if(ExpressNumber==Integer.parseInt(str.substring(0, 2))){      //ʹ��һ���򵥵��㷨������Ŀǰ�ǲ���Ŀ����Ϣ��
					list.add(str);
					str=bin.readLine();
					str=str+"-->"+Destination;
					//System.out.println("��Ϣ�Ѹ���");
					flag=1;
					}
				}
				list.add(str);
				
				}
			if(flag!=1)
				//System.out.println("δ��ѯ�����");
				{bin.close();
			return "δ��ѯ�����";}
			bin.close();
			FileWriter fout = new FileWriter(".\\ExpressData.txt");
			BufferedWriter bout=new BufferedWriter(fout);
			for(int i=0;i<list.size();i++)
			{bout.write(String.valueOf(list.get(i)));
			bout.write("\r\n");}
			bout.close();
			return "��Ϣ�Ѹ���";
	}
	
	public String Read_All_Express(int Number) throws IOException{
		String str;
		FileReader fin=new FileReader(".\\ExpressData.txt");
		BufferedReader bin=new BufferedReader(fin);
		ExpressNumber=Number;
		while((str=bin.readLine())!=null)
			if(ExpressNumber==Integer.parseInt(str.substring(0, 2)))
				{
				return "����:	  �ļ���:	������:	������:	Ŀ�ĵ�:"+"\r\n"+str+"\r\n"+"��ǰλ��:"+"\r\n"+bin.readLine().substring(7)+"\r\n";
				}
		bin.close();
		return "";
		
		}
}