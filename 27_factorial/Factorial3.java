import java.util.Scanner;
class Factorial3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = s.nextLong();
        System.out.println("Factorial of a number is "+ fact(num));
    }
    public static long fact(long num)
    {
        if(num==1)
        {
            return 1;
        }else{
            return num * fact(num-1);
        }
    }
}