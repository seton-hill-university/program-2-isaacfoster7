
 import java.util.Scanner;
 
public class program2hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner (System.in);
	
	// collect input from user
	
	System.out.println("What is your first number?");
	int firstnum = keyboard.nextInt();
	System.out.println("What is your second number?");
	int secondnum = keyboard.nextInt();
	System.out.println("What is your third number?");
	int thirdnum = keyboard.nextInt();
	
	//menu 
	
	System.out.println("mathematic menu options");
	System.out.println("option 1: multiplication");
	System.out.println("option 2: division");
	System.out.println("option 3: divide all 3");
	System.out.println("option 4: multiply all 3");
	
	int option = keyboard.nextInt();

	// switch statements
	int sum = 0;
	switch(option)
	
	{
	case 1:
	sum = firstnum * secondnum;
	System.out.println("when multiplying your first and second number we get " + sum);
	
	break;
	
	case 2:
	sum = firstnum/secondnum;
	System.out.println("when dividng your first two numbers we get " + sum);
	
	break;
	
	case 3:
	sum = firstnum/secondnum/thirdnum;
	System.out.println("when dividing your first three numbers we get " + sum);
	break;
	
	case 4:
	sum = firstnum * secondnum * thirdnum;
	System.out.println("when multiplying your first three numbers we get " + sum);
	break;
	
	
	}
	
	//now use if/else statements
	
	//if statement
	if(sum > thirdnum)
	{
	System.out.println("This number is greater than the third number you inputed");
	}
	
	//else statement
	else
	{
	System.out.println("this number is not greater than the third number you inputed");
	}
	
	
	
	
	
	}

}
