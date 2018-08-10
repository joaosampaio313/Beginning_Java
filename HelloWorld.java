import java.util.*;
public class HelloWorld{
    public static void main(String[] args){
        int a = 1;
        double money = 9.5;
        String ola = "Hello World \n";
        String aux = "I have ";
        money*=a;
        
        if (a >= 2){
            System.out.println(ola + aux + money + "years. \n");
    }
        else {
            if (a == 1){
             System.out.println("I have some money..." + money);
            }
            else{
             System.out.println("I dont have money");
            }
    }
}
        
}