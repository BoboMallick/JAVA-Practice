// WAP to create Calculator using switch statement.
import java.util.Scanner;

class Calculator2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First no.");
        int no1=s.nextInt();
        System.out.println("Enter Second no.");
        int no2=s.nextInt();
        System.out.println("Select symbol(+,-*,/)");
        String sym=s.next();
        int res;
        switch(sym)
        {
            case"+": res=no1+no2;
            System.out.println("Addition is:"+res);
            break;

            case"-": res=no1-no2;
            System.out.println("Subtraction is:"+res);
            break;

            case"*": res=no1*no2;
            System.out.println("Multiplication is:"+res);
            break;

            case"/": res=no1/no2;
            System.out.println("Division is:"+res);
            break;
        }
    }    
}
