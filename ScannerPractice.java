import java.util.*;
public class ScannerPractice{
    static Scanner key = new Scanner(System.in); 
    
    public static void main(String []args){
        System.out.println("Tell me your name. \n");
        String name = key.nextLine();
        
        System.out.println("Tell me your age. \n");
        int age = key.nextInt();
        
        System.out.println("Tell me your height. \n");
        
        double height = key.nextDouble();
        
        
        System.out.println("Your name is "+ name + ", your age is " + age + " and your height is " + height);
        
    
    
    
    
    }
}
