import java.util.*;
public class Test2
{
        public static void main(String [] args) {
        int i = 0;
        ArrayList <OClass> oc = new ArrayList<OClass>(2);
        
        for (; i < 10; i++){
            oc.add(new OClass(i));
        }
        
        for (i = 0; i < oc.size(); i++){
            System.out.println(oc.get(i).compute());
        }
   }
}
