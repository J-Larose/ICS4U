/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmpractice;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class AlgoritmPractice {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int Max=7;
        int Min =0;
        
        int tries=0;
                
        int point = (int) ((Math.random() * 6) );
        System.out.println ("point "+point);
        roll(point, tries);
        
    }
    
    public static void roll(int point, int tries){
        int number = (int) ((Math.random() * 6));
        int i=0;
        while (point!=number){
            number = (int) ((Math.random() * 6));
            tries=tries+1;
            System.out.println ("tries "+tries);
            i++;
            System.out.println ("number"+i+" "+number);
        }
    }
    
}
