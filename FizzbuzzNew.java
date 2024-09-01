import java.io.FileWriter; 
public class FizzbuzzNew
{
    public static void main(String[]args)
    {
       try
    {
      FileWriter fw = new FileWriter("C:\\Users\\matth\\OneDrive\\Programming OneDrive\\Java-Practice\\Fizzbuzz.txt");
        int i = 1;
        while(i<=100)
        {
            fw.write(i);
            if(i%5==0)
            {
                fw.write("fizz");
            }
            if(i%7==0)
            {
                fw.write("buzz");
            }
            fw.write("/n");
            i++;
        }
    }
       catch(Exception e){System.out.println(e);} 
}
}