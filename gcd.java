import java.util.*;
public class gcd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of numbers to find gcd");
		int n=sc.nextInt();
		int a[]=new int[n];
		//int d[]=new int[100];
		ArrayList<Integer> d=new ArrayList<Integer>();
		ArrayList<Integer> e=new ArrayList<Integer>();
		int c=0,k=0;
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int b=a[0];
		for(int i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				d.add(i);
			}
		}
		int flag=0;
		for(int i=0;i<d.size();i++)
		{
			if(a[k]%d.get(i)==0)
			{
				e.add(d.get(i));
				//k++;
			}
			
			flag = flag+1;
			if(flag==d.size())
			{
				k++;
				i=-1;
			}
		}
		int max=e.get(0);
		for(int i=1;i<e.size();i++)
		{
			if(max<e.get(i))
			{
				max=e.get(i);
			}
		}
		System.out.println(max);
	}
}
