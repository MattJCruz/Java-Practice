import java.io.FileWriter; 
public class FizzbuzzNew
{
    public static void main(String args[])
    {
       try
    {
      FileWriter fw = new FileWriter("C:\\Users\\matth\\OneDrive\\Programming OneDrive\\Java-Practice\\FizzbuzzNew.txt");
        for(int i = 1;i<=100;i++)
        {
            System.out.println(i);
            fw.write(i);
            if(i%5==0)
            {
                System.out.println(" Fizz");
                fw.write(" Fizz");
                if(i%7==0)
                  {
                      System.out.println("buzz");
                      fw.write("buzz");
            }
            }
            if(i%7==0)
            {
                fw.write("buzz");
                System.out.println("buzz");
            }
            fw.write("\n");
            System.out.println("\n");
        }
        fw.close();
    }
       catch(Exception e){System.out.println(e);} 
}
}