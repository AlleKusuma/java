class add_Extra1
{
	public static void main(String args[])
	{
		int n=12391,rem,sum=0,mul=1;
		while(n!=0)
		{
			rem=(n%10)+2;
			if(rem==10)
				rem=0;
			sum=sum+rem*mul;
			mul=mul*10;
			n/=10;
		}
		System.out.println(sum);
	}
	
}