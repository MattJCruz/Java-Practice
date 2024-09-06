import java.io.FileWriter;

public class Fizzbuzz {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("C:\\\\Users\\matth\\OneDrive\\Programming OneDrive\\Java-Practice\\Fizzbuzz.txt");
            for (int x = 1; x <= 100; x++) {
                if (x % 5 == 0) {
                    fw.write("fizz");
                    System.out.println("fizz");
                    if (x % 7 == 0) {
                        fw.write("buzz\n");
                        System.out.println("buzz\n");
                    } else {
                        fw.write("\n");
                        System.out.println("\n");
                    }
                } else if (x % 7 == 0) {
                    fw.write("Buzz\n");
                    System.out.println("Buzz\n");
                } else {
                    fw.write(x + "\n");
                    System.out.println("\n");
                }
            }
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}