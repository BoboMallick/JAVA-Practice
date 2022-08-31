import java.util.Scanner;
class UserInput
 {
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in)) 
        {
            System.out.println("Enter name :");
            String name=s.next();
            System.out.println("Enter your age :");
            int age=s.nextInt();
            System.out.println("Enter your Gender :");
            char gender=s.next().charAt(0);
            System.out.println("Enter your Ph.No");
            long phno=s.nextLong();
            System.out.println("-------------------------");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gender);
            System.out.println("Name:"+phno);
        }
    }
 }