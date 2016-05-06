/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlambda;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author aonorati
 */
public class TestLambda {

    public void sss(){
        List<String> places = asList("Buenos Aires", "Córdoba", "La Plata");
        places.sort((String o1, String o2) -> o1.compareToIgnoreCase(o2));
    }
    
    public static void testOptional(){
        List<String> places = asList("Buenos Aires", "Córdoba", "La Plata");
        places.stream().forEach((s) -> {
            System.out.println(s);
        });
        Optional<String> result = places.stream().filter(s->s.equalsIgnoreCase("Córdoba")).findAny();
        out.println(result.orElse("non c'e'"));
        Optional<String> result2 = places.stream().filter(s->s.equalsIgnoreCase("fava")).findAny();
        out.println(result2.orElse("non c'e'"));
    }
    
    public void testLoop(){
        int sum = 0;
        for(int i=0;i<10;i++){
             sum = sum + 1;
        }
    
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testOptional();
    }
    
}
