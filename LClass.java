import java.util.*;
public class LClass{
    
    public LClass(){
    }
    
    public void compute(){
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        int i = 0;
        ArrayList <Integer> arrList = new ArrayList<Integer>();
        
        for (; i < array.length; i++){
            arrList.add(i);
        }
        
        for (i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    
    }
}
