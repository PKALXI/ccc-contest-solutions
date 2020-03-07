import java.util.Scanner;

public class ccc04j1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double lopo = Math.sqrt(num);
        double kolo = Math.floor(lopo);
        System.out.println("The largest square has side length " + (int)kolo + ".");
    }
}
