package multidimarray;

public class multidimarrraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][] = new int [3][2];    //3 rows and 2 colums
		
		a[0][0] = 100;   //index start from o,1,3......
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		
		System.out.println("Number of rows: " + a.length);
		System.out.println("Number of colums: " + a[0].length);
		
		for (int i=0; i<a.length; i++)      //i for rows        //0123456
		{
			for (int j=0; j<a[i].length; j++)   //j for colum   //01
			{
				System.out.println(a[i][j]);
			}
			
		}
		
				
	
	}

}
