package javaOperators;

public class SeasonsMonth 
{

	public static void main(String[] args)
	{
		int month = 12;
		
		if (month ==1 || month ==2 || month == 11 || month ==12)
		{
			
			System.out.println("It's  Winter Season");
		}
		else if(month ==3 || month ==4 || month == 5 )
		{
			System.out.println("It's  Summer Season");
		}
		
		else if(month ==6 || month ==7 || month == 8 || month==9 )
		{
			System.out.println("It's  Monsoon Season");
		}
		
		else if(month ==10)
		{
			System.out.println("October Heat");
		}
		else
		{
			System.out.println("Invalid  Number Selected");
	    }
	
	}
}
