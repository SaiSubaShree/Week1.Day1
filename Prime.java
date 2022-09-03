package week1.day1;

public class Prime {
public static void main(String args[])
{
	int n=23;
	int m=0;
	//int m=n/2;
	
	if(n==0|| n==1)
	{
		System.out.println("The number is not prime number");
	}
	else 
	{
		for (int i=1;i<=n;i++)
		{
			System.out.println(n + " modulo of " + i + "=" + (n%i));
			if(n%i==0)	
			{
				m++;
			}
		}
		if(m==2)
		{
			System.out.println("The number '" + n + "' is a  prime number");
		}
		else
		{
			System.out.println("The number is a not prime number");
		}
	}	
}
}
