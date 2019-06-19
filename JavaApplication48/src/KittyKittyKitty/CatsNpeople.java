package KittyKittyKitty;

import java.util.ArrayList;

public class CatsNpeople {

    ArrayList<Integer> houseOfCats(int legs) {
    
        ArrayList<Integer> people = new ArrayList<>();

        int n = 0;
        while (legs >= 0) {
            int i = 0;
            if (legs % 4 == 2 || legs % 4 == 0) {   
               i = ((legs%4)==2) ? 1:0;
            }
            people.add(n+i); 
            n+=2;
            legs -= 4;
        }

        System.out.println(people);
        return people;
      
    }
       
    public static void main(String[] args){

        CatsNpeople cp = new CatsNpeople();
        cp.houseOfCats(6);
        
  
    }
    
}
