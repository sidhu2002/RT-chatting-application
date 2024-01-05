package problems;

import java.util.*;

public class AL {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(8);
        
        Collections.sort(list);
        
        list.remove(2);
        list.set(0,1);
        System.out.println(list);

    }
    
}
