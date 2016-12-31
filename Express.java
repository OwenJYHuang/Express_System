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
		FileWriter fout = new FileWriter(".\\ExpressData.txt",true);//以追加的形式写入
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
	
		//System.out.println("快递信息已录入");
		bout.close();
		return "快递信息已录入\r\n您的快递单号是:"+newNumber;
		
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
			return "单号:	  寄件人:	接收人:	出发地:	目的地:"+"\r\n"+str+"\r\n"+"	当前位置:"+"\r\n	"+bin.readLine().substring(7);
			}
	if(flag!=1)
		return "未查询到结果";	
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
				list.add(str);				 //用list临时保存信息再写入，达到删除的目的
				else
				flag=1;
					}
			
			
			//将复制的文件保存为新文件
			 FileWriter fout = new FileWriter(".\\ExpressData.txt");
				BufferedWriter bout=new BufferedWriter(fout);
			for(int i=0;i<list.size();i++)
			{bout.write(String.valueOf(list.get(i)));
			bout.write("\r\n");}
			bin.close();
			bout.close();
			if(flag==1){
				return "已成功删除！";
			}
			if(flag!=1)
				return "未查询到结果";
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
				if(ExpressNumber==Integer.parseInt(str.substring(0, 2))){      //使用一个简单的算法来计算目前是不是目标信息处
					list.add(str);
					str=bin.readLine();
					str=str+"-->"+Destination;
					//System.out.println("信息已更新");
					flag=1;
					}
				}
				list.add(str);
				
				}
			if(flag!=1)
				//System.out.println("未查询到结果");
				{bin.close();
			return "未查询到结果";}
			bin.close();
			FileWriter fout = new FileWriter(".\\ExpressData.txt");
			BufferedWriter bout=new BufferedWriter(fout);
			for(int i=0;i<list.size();i++)
			{bout.write(String.valueOf(list.get(i)));
			bout.write("\r\n");}
			bout.close();
			return "信息已更新";
	}
	
	public String Read_All_Express(int Number) throws IOException{
		String str;
		FileReader fin=new FileReader(".\\ExpressData.txt");
		BufferedReader bin=new BufferedReader(fin);
		ExpressNumber=Number;
		while((str=bin.readLine())!=null)
			if(ExpressNumber==Integer.parseInt(str.substring(0, 2)))
				{
				return "单号:	  寄件人:	接收人:	出发地:	目的地:"+"\r\n"+str+"\r\n"+"当前位置:"+"\r\n"+bin.readLine().substring(7)+"\r\n";
				}
		bin.close();
		return "";
		
		}
}