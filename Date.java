package cargo;


public class Date {
	private int year;
	private int month;
	private int day;
	protected void setDate(int a,int b,int c){
		year = a;
		month=b;
		day=c;
	}
	
	public void show(){
		System.out.println("�ļ�����Ϊ��"+year+"��"+month+"��"+day+"��");
	}

}
