/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Travis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author adeeb
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello");
        List<String> aList = Arrays.asList("x", "y", "z"); 
        List<Integer> nList = new ArrayList<>();
        nList.add(7); 
        nList.add(12); 
        nList.add(44); 
        
        Predicate<Integer> p1 = num->num.equals(15); 
        linearSearch(nList,p1); 
        
        Predicate<Integer> p2 = num->num.equals(44);
        linearSearch(nList,p2); 
        
        
        Predicate<String> ps = ch->ch.equals("y");
        linearSearch(aList, ps);
        
    }
 public static <T> int linearSearch(List<T> list, Predicate<T> check)
 {
     for(int i = 0; i< list.size(); i++) {
        if(check.test(list.get(i)))
            return i;
     }
      return -1; 
    }
}
