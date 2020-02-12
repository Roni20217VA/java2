package FinalVariable;

public class Bike1 { //Final class can not be extendes into child class
	
	int speed = 40;
	void run() 
	{
	 System.out.println(speed);	
	}
}

class Honda extends Bike1 
{
	
}
public class FinalKeyExample
{
final int speed = 40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyExample F = new
		FinalKeyExample();
		F.speed = 900;
		
		System.out.println(F.speed);

	}

}
