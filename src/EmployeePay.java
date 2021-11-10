import java.util.Scanner;

public class EmployeePay 
{
	   public static void main(String[] args)
	   {
	   double Salary,r,OverTime,regt;
	   int hoursWorked;
	   System.out.print("Weekly Pay of the Employee");
	   System.out.println();
	   Scanner input = new Scanner(System.in);
	       System.out.print("Enter the working hours:");
	       hoursWorked = input.nextInt();
	System.out.println();
	System.out.print("Enter the hourly pay rate (in Ghana Cedis):");
	r = input.nextDouble();
	System.out.println();
	if (hoursWorked > 56 && hoursWorked < 70)
	{
	   OverTime = (double)(1.5 * r * (hoursWorked - 56));
	   regt = (double)(56 * r);
	   Salary = regt + OverTime;
	   System.out.printf("Your overtime pay is %.2f Cedis ",OverTime);
	   System.out.println();
	   System.out.printf("Your regular pay is %.2f Cedis ",regt);
	   System.out.println();
	   System.out.printf("Your weekly pay is %.2f Cedis ",Salary);
	}
	else if (hoursWorked > 70)
	{
	Salary = (double)(56 * r);
	System.out.printf("Your weekly pay is %.2f Cedis",Salary);
	System.out.println();
	System.out.printf("Sorry, your overtime pay cannot be process..");
	System.out.println();
	}
	else
	{
	   Salary = (double)(hoursWorked * r);
	System.out.printf("Your weekly pay is %.2f Cedis",Salary);
	System.out.println();
	System.out.printf("Sorry, you don't qualify for overtime pay :)");
	}
	   }
	}

