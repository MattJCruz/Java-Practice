import java.io.FileWriter; 
public class Fizzbuzz
{
  
  public static void main(String args[])
  {
    try
    {
      FileWriter fw=new FileWriter("D:\\Fizzbuzz.txt");
      for(int x = 1; x <= 100; x++)
      {
        
        if( x % 5 == 0)
        {
          fw.write("fizz");
          if(x % 7 == 0)
          {
            fw.write("buzz\n");
          }
          else
          {
            fw.write("\n");
          }
        }
        else if(x % 7 == 0)
        {
          fw.write("buzz\n");
        }
        else
        {
          fw.write(x + "\n");
        }
      }
      fw.close();
      
    }
    catch(Exception e){System.out.println(e);}    
    System.out.println("Success...");    
  }
}