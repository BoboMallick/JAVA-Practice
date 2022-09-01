class Calculator 
{
    public static void main(String[] args)
    {
        int no1=10,no2=20, reg;
        String symbol = "+";
        switch(symbol)
        {
            case "+": reg=no1+no2;
            System.out.println(reg);
            break;

            case "-": reg=no1+no2;
            System.out.println(reg);
            break;

            case "*": reg=no1+no2;
            System.out.println(reg);
            break;

            case "/": reg=no1+no2;
            System.out.println(reg);
            break;
            default:System.out.println("Invalid Input");
            break;
        }
    }    
}
