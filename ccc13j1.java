import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int y = in.nextInt();
        int m = in.nextInt();
        int o = (m-y)+m;
        System.out.println(o);

    }
}
