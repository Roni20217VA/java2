package inheritance;

class A
{
int a;
void display()
{
	System.out.println(a);
}
}

class B extends A
{
	int b;
	void print()
	{
	System.out.println(b);	
	}
}

class c extends B
{
	int c;
	void show()
	{
		System.out.println(c); //logic or method
	}
}

public class demo2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	//object or values
c cobj = new c();
cobj.a=10;
cobj.b=20;
cobj.c=30;

cobj.display();
cobj.print();
cobj.show();


	}

}
