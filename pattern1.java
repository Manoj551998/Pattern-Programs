package patterns;

import java.util.*;

public class Pattern1 {

	//to print
	
//	5     1
//	 4  2 
//	   3
//	 2  4
//	1     5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,m=(n+1)/2;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j)
				{
					if(i<m)
					{
						System.out.print(n+1-i);
					}
					else
					{
						System.out.print(i);
					}
					
				}
				
				else if(i+j==n+1)
				{
					if(i<m)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print(n+1-i);
					}
				}
					
				else
					System.out.print("   ");	
			}
			System.out.println();	
		}

	}

}
