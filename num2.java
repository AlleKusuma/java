class num2   
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			int k=i;
			for(int j=1;j<=5;j++)
			{
				if(j%2!=0)
				{
					System.out.print(k+"alle kusuma ");
					k+=10;
				}
				else
				{
					System.out.println(k+"kusuma");
					k+=9;
				}
			}
			System.out.println();
		}
	}
}