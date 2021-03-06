
public class PrintName {

	public static void main(String[] args) {
		PrintName l=new PrintName();
		l.printS();
		l.printE();
		l.printL();
		l.printV();
		l.printE();
		l.printN();
		l.printD();
		l.printI();
		l.printR();
		l.PrintA();
		l.printN();
		l.printInitial();
	}
	private void printInitial() {
		System.out.println(" * ");
		System.out.println();
		System.out.println();
		printR();
	}
	private void printR() {
		for(int i=1;i<=11;i++)
		{
			System.out.print("*");
			if(i==1||i==6)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print(" *");
				}
			}
			else if(i<6)
			{
				for(int k=1;k<=9;k++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else
			{
				for(int l=1;l<=i;l++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	private void printI() {
		for(int i=1;i<=11;i++)
		{
			if(i==1||i==11)
			{
				for(int j=1;j<=11;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int k=1;k<=5;k++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	private void printD() {
		for(int row=1;row<10;row++)
		{
			if(row==1||row==9)
			{
				for(int i=1;i<=6;i++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("*");
				for(int i=1;i<=11;i++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	private void printN() {
		for(int row=1;row<=11;row++)
		{
			System.out.print("*");
			for(int j=1;j<=row;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=11;k>=row;k--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private void PrintA() {
		for(int row=1;row<=9;row++)
		{
			for(int j=row;j<=9;j++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=1;i++)
			{
				System.out.print("*");
			}
			for(int j=1;j<row;j++)
			{
				if(row==6) System.out.print("**");
				else System.out.print("  ");
			}
			for(int i=1;i<=1;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private void printV() {
		for(int row=1;row<=10;row++)
		{
			for(int space=2;space<=row;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print("*");
			}
			for(int innerSpace=row;innerSpace<10;innerSpace++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=1;j++)
			{
				System.out.print("*");
			}
			if(row<=10)
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	

	private void printL() {
		for(int row=1;row<=9;row++)
		{
			System.out.println("*");
			if(row==9)
			{
				for(int i=1;i<=9;i++)
				{
					System.out.print("* ");
				}
			}
		}
		System.out.println();
		System.out.println();
	}

	private void printE() {
		for(int row=1;row<=11;row++)
		{
			if(row==1||row==11||row==6)
			{
				for(int i=1;i<=8;i++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	public void printS()
	{
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
				for(int i=1;i<=7;i++)
				{
				System.out.print(" *");
				}
			}
			else
			{
				if(row<5)
					System.out.print("*");
				else 
				{
					for(int i=1;i<=15;i++)
					{
						System.out.print(" ");
					}
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
