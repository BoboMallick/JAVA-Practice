class Factorial4
{
    public static void main(String[] args)
    {
        Factorial4 r=new Factorial4();
        int a= r.sum(8);
    
        System.out.println("Factorial number is "+a);
    }
    int sum(int b)
    {
        if(b>0){
            return b*sum(b-1);
        }
        return 1;
    }
}