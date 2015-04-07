/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author stone_000
 */
public class SwingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        boolean valid=false;
        
//        int i=1/0;
//        System.out.println(i);
        
        while (valid == false) {
            try {
                String x = input.nextLine();
                Integer.parseInt(x);
                System.out.println("good");
                break;
                
            } catch (NumberFormatException x) {
                System.out.println("not valid try again");
            }
            
//            try {
//                System.out.println("enter a thing");
//                int x = input.nextInt();
//                break;  
//            } catch (InputMismatchException x) {
//                System.out.println("not valid try again");
//                
//            }
        }
        
    }
    
}
