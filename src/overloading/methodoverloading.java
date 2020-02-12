package overloading;

public class methodoverloading {
	//method overloading is feature that allow a class
	//to have more than one method have the same name
	
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
    
	void add (int a, double b)
	{
		System.out.println(a+b);
	}

	void add (double a, double b)
	{
		System.out.println(a+b);
	}

	void add (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading mo = new methodoverloading();
		mo.add(10, 20); //1
		mo.add(10, 20.05); //2
		mo.add(10.0, 20.0);//3
		mo.add(3, 10, 15);//4

	}

}
