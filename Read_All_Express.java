package com.Express;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Read_All_Express extends Express{
//class Delete_Express extends Express{
	public  void Delete_Express() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			String str="";
			int flag=0;
			FileReader fin=new FileReader(".\\ExpressData.txt");
			BufferedReader bin=new BufferedReader(fin);
			ArrayList<String> list = new ArrayList<String>();
			System.out.println("������Ҫɾ���Ŀ�ݺ�:");
			ExpressNumber=Integer.parseInt(br.readLine());
			while((str=bin.readLine())!=null){
				if(ExpressNumber!=Integer.parseInt(str.substring(0, 2)))
				list.add(str);
				else
					{
					System.out.println("����ɾ����"+"\r\n"+"����:	  �ļ���:	������:	������:	Ŀ�ĵ�:");		
					System.out.println(str);
					flag=1;
					}}
			if(flag!=1)
				System.out.println("δ��ѯ�����");
			bin.close();
			System.out.println(list);
			//�����Ƶ��ļ�����Ϊ���ļ�
			 FileWriter fout = new FileWriter(".\\ExpressData.txt");
				BufferedWriter bout=new BufferedWriter(fout);
			for(int i=0;i<list.size();i++)
			{bout.write(String.valueOf(list.get(i)));
			bout.write("\r\n");}
			bout.close();
	}
}
