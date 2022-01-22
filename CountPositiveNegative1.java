import java.util.Scanner;
public class CountPositiveNegative1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i,zero=0,len;
		int positiveCount = 0, negativeCount = 0;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		int [] a = new int[Size];
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] > 0)
			{
				positiveCount++;
			}
			else
			{
				negativeCount++;
			}
			if(a[i]==0)
			{
				zero++;
			}
		   len=a.length;
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + (float)(positiveCount)/a.length);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + (float)(negativeCount)/a.length);
		System.out.println("\n Total Number of Negative Numbers in this Array = " + (float)(zero)/a.length);
	}
}