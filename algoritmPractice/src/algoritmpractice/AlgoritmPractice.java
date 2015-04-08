/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmpractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
        ArrayList<Integer> triesList= new ArrayList();
        boolean tryAgain =false;
        Scanner input= new Scanner(System.in);
        
        
        do {
            int tries=0;
            int point = (int) ((Math.random() * 6) );
            System.out.println ("point "+point);
            tries = roll(point, tries);
            
            triesList.add(tries);
            
            System.out.println ("try again?");
            String x = input.nextLine();
            
            if (null != x)switch (x) {
                case "yes":
                    tryAgain=true;
                    break;
                case "no":
                    tryAgain=false;
                    break;
                default:
                    System.out.println("not valid answer");
                    break;
            }
        }while(tryAgain==true); 
        
        double average = 0;
        double sum = 0;
        if (!triesList.isEmpty()) {
            for (Integer mark : triesList) {
                sum += mark;
            }
            average=sum / triesList.size();
        }else {
            System.out.println("error");
        }
        System.out.println("average=="+average);
        
    }
    
    public static int roll(int point, int tries){
        int number = (int) ((Math.random() * 6));
        int i=0;
        if (point==number){
            System.out.println("first try");
        }
        while (point!=number){
            number = (int) ((Math.random() * 6));
            tries=tries+1;
            System.out.println ("tries "+tries);
            i++;
            System.out.println ("number"+i+" "+number);
        }
        return tries;
    }
}
