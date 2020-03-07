import java.util.Scanner;
public class ccc14j1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      
       int [] num;
       num = new int [3];
       num [0] = in.nextInt();
       num [1] = in.nextInt();
       num [2] = in.nextInt();
       int sum = num [0] + num [1] + num [2];
       if(sum == 180){
           if((num [0] == num [1] && num [2] != 60 || num [1] == num [2]) && num [0] != 60 || num [0] == num[2] && num [1] != 60 ) {
               System.out.println("Isosceles");
           } else if(num [0] == num [1] && num [1] == num [2]) {
               System.out.println("Equilateral");
           }else{
               System.out.println("Scalene");
           }
       }else{
           System.out.println("Error");
       }
       
    }
    
}
