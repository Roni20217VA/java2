package oop;

public class constructordemo {
	
	//defalut constructor
	
	
	int x;
	int y;
	
	constructordemo()
	
	{
		x=10; //define values in the centric not in the execution 
		y=20;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructordemo cm1 = new constructordemo();
		cm1.display();
	}

}
