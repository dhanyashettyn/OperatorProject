package javaOperators;

public class LogicalOperators 
{

	public static void main(String[] args) 
	{
		int student1 = 80;
		int student2 = 70;
		int student3 = 70;
		
		if(student1 < student2)
			System.out.println("Student2 is a Topper");
		else 
			System.out.println("Student1 is a Topper");

		if(student2 < student1)
			System.out.println("Student2 is a Looser");
		else 
			System.out.println("Student1 is a Topper");

		if(student1 == student2)
			System.out.println(" Both have same marks ");
		else 
			System.out.println("not same ");
	
		if(student3 == student2)
			System.out.println("Both have same marks ");
		else 
			System.out.println("not same ");
		
		if(student1 != student2)
			System.out.println("Both marks are different ");
		else 
			System.out.println(" same ");
		
		
		
		
		
		if((student1 == student2) && (student1 != student2))
			System.out.println(" Both have same marks ");
		else 
			System.out.println("not same ");
		
		if((student1 == student2) || (student1 != student2))
			System.out.println("Both have same marks ");
		else 
			System.out.println("not same ");
	
	
	
	
	
	}

}
