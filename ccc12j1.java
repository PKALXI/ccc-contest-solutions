mport java.util.Scanner;



public class ccc12j1 {
    

      
    
    public static void main(String [] args){
     
    Scanner in = new Scanner(System.in);
           
            int speed = in.nextInt();
           
            int curSpeed = in.nextInt();
            if (curSpeed<=speed){
                System.out.println("Congratulations, you are within the speed limit!");
                
            }else if(curSpeed <= speed + 20){
                System.out.println("You are speeding and your fine is $100.");
            }else if(curSpeed <= speed + 30){
                System.out.println("You are speeding and your fine is $270.");
            }else{
                System.out.println("You are speeding and your fine is $500.");
            }
        
    }
    
     
    }
