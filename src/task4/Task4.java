package task4;
import java.util.Scanner;
import static task4.library_user.a;
interface library_user
{       
        static  String  a="hello welcome to program";
	int Register_account();
	void Request_book();
}
class Kids_user implements library_user
{
	int age;
	String book_type;
	public int Register_account()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(age<8)
		{
			System.out.println("You have successfully registered under kids account.");
		}
		else
		{
			System.out.println("Age must be less than "); 
		}
            return 0;
	}
	public void Request_book()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book type:");
		book_type=sc.next();
		
		if(book_type.equals("kids"))
		{
			System.out.println("Book issued succesfully");
		}
		else 
		{
			System.out.println("You are not allowed to take kids books");
		}
	}
}
class Adult_user implements library_user
{
	int age;
	String book_type;
	public int  Register_account()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age:");
	age=sc.nextInt();
	if(age<18)
	{
		System.out.println("Your age must be greater than 18");
	}
	else
	{
		System.out.println("You have successfully registered under adult account.");
	}
            return 0;
        }
	public void Request_book()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book type:");
		book_type=sc.next();
		if(book_type.equals("adult"))
		{
			System.out.println("Book issued succesfully");
		}
		else 
		{
			System.out.println("You are not allowed to take adult books");
		}
	}
}

public class Task4 {

    
    public static void main(String[] args) {
        int b,c;
        Kids_user obj1=new Kids_user();
         Adult_user obj2=new Adult_user();
            System.out.println(a);
        b= obj1.Register_account();
         obj1.Request_book();
        c= obj2.Register_account();
         obj2.Request_book();

        
    }
    
}
