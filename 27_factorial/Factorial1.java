import java.util.Scanner;
class Factorial1 
{
    public static void main(String[] args)
    {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the no");
            int no=s.nextInt();
            int fact=1;
            for(int i=no;i>=no;i--)
            {
                fact=fact*i;
            }
            System.out.println("Factorial: " + no + " is " + fact);
        
    }
}
