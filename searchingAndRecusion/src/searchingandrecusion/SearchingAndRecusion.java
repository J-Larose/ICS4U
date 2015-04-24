/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingandrecusion;

import java.util.Scanner;

/**
 *
 * @author Jacob Larose
 */
public class SearchingAndRecusion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean tryAgain=false;
        String list[]={"blue", "Green", "Yellow"};
        String input;
        boolean found=false;
        Scanner scanner= new Scanner(System.in);
        
        do{
            input = scanner.nextLine();
            for(int i=0; i<list.length; i++){
                if (input.equals(list[i])){
                    found =true;
                    System.out.println("found at "+ i);
                    break;
                }
            }
            if (found==false){
                System.out.println("Not found");
            }
            System.out.println("try again?");
            input = scanner.nextLine();
            
            if ("yes".equals(input)){
                tryAgain=true;
                found=false;
            }else{
                tryAgain=false;
            }
            
        }while(tryAgain==true);
    }
    
    public static void sortStringBubble(String list[]) {
        int j;
        boolean flag = true;
        String temp;

        while (flag) {
            flag = false;
            for (j = 0; j < list.length - 1; j++) {
                if (list[j].compareToIgnoreCase(list[j + 1]) > 0) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
        }
    } 
}
