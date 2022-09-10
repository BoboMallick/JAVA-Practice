import java.util.Scanner;
class PrimeNo2
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number");
        int no=r.nextInt();
        for(int i=1; i<=no; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime number.");
        }
        else{
            System.out.println("not a Prime number");
        }
    }    
}
