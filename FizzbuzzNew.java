public class Fizzbuzz
{
    public static void main(String[]args)
    {
        int i = 1;
        while(i<=100)
        {
            System.out.print(i);
            if(i%5==0)
            {
                System.out.print("fizz");
            }
            if(i%7==0)
            {
                System.out.print("buzz");
            }
            System.out.println(" ");
            i++;
        }
    }
}