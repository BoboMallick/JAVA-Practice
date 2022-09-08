//Reverse a number that has a ZERO at the last placein Java.

import java.util.Scanner;
class ReverseANum2
{
    public static void main(String args[])
    {
        int rem;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();
        while(no>0)
        {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }   
}