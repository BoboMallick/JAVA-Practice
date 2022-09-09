class PrimeNo
{
    public static void main(String[] args)
    {
        int no =9;int temp =0;
        for(int i=2; i<=no-1; i++) 
        {
            if(no%i==0)
            {
                temp++;
            }
        }
        if(temp==0)
        {
            System.out.println(no+" is prime");
        }
        else
        {
            System.out.println(no+" is not prime");
        }
    }
}
