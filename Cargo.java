package cargo;

public class Cargo {
	public String expressNumber;
	protected String sender;
	protected String receiver;
	protected Date date=new Date();
    protected String startPlace;
    protected String startAddress;
	protected String destination; 
	protected String address;
	protected String location;
	
	public boolean search(String a){
		if(expressNumber.equals(a))
			return true;
		else 
			return false;
	}
	public void setCargo(String expressNumber,String sender,String receiver,int a,int b,int c,String startAddress,String startPlace,String destination,String address, String location){
	   	date.setDate(a,b,c);
	   	this.expressNumber=expressNumber;
	   	this.sender=sender;
	   	this.receiver=receiver;
	   	this.startAddress=startAddress;
	   	this.startPlace=startPlace;
	   	this.startPlace=startPlace;
	   	this.destination=destination;
	   	this.address=address;
	   	this.location=location;
	   	
	}
  public void setDate(int a,int b,int c) {
	  date.setDate(a,b,c);
    }
    public void setSender(String s){
    	sender=s;
    }
    public void setStartPlace(String s){
    	startPlace = s;
    }
    public void setStartAddress(String s){
    	startAddress=s;
    }
    public void setReceiver(String s){
    	receiver=s;
    }
    public void setDestination(String s){
    	destination=s;
    }
    public void setAddress(String s){
    	address=s;
    }
    public void setLocation(String s){
    	location=s;
    }

	public void getInf(){
		 date.show();
		 System.out.println("�ļ���Ϊ��"+sender);
		 System.out.print("ʼ���أ�"+startPlace);
		 System.out.println(startAddress);
		 System.out.println("�ռ���Ϊ��"+receiver);
		 System.out.print("�ռ���ַ��"+destination);
		 System.out.println(address);
		 System.out.println("������ǰ�ѵ��"+location);
	}

}
