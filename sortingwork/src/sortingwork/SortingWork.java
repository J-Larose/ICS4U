package sortingwork;
import java.util.Random;
/**
 *
 * @author Jacob Larose
 */
public class SortingWork {
    /**
     * 
     * @param args
     * @throws Exception 
     */
    public static void main(String args[]) throws Exception {
        /**
         * create 2 int list 2 arrays for sorting with 2 methods
         */
        int listLenth;
        listLenth = (int) ((Math.random() * 20) + 20);
        int[] list = new int[listLenth];
        int[] list2 = new int[listLenth];

        /**
         * randomly populate int list 2 arrays setting them equal to each other
         */
        for (int i = 0; i < listLenth; i++) {
            int j = (int) (Math.floor(Math.random() * 101));
            list[i] = j;
        }

        list2 = list;
        /**
         * create char array
         */
        char[] list3 = new char[listLenth];

        /**
         * randomly populate char array
         */
        for (int i = 0; i < listLenth; i++) {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');

            list3[i] = c;
        }
        /**
         * print original int array
         */
        System.out.println("list");

        for (int x : list) {
            System.out.print(x + " ");
        }

        System.out.println();
        /**
         * sort with merge sort function then print merge sorted array
         */
        mergeSort(list);

        System.out.println("merge sorted");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        /**
         * sort with count sort then print sorted list
         */
        countSort(list2);

        System.out.println("count sorted");

        for (int x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();

        /**
         * print original char list 2 array, sort and print sorted
         */
        System.out.println("char array");
        for (int i = 0; i < listLenth; i++) {
            System.out.print(list3[i] + " ");
        }
        System.out.println();
        bubbleSort(list3);
        System.out.println("sorted");
        for (int i = 0; i < listLenth; i++) {
            System.out.print(list3[i] + " ");
        }
    }
    /**
     * 
     * @param list
     * @return 
     * 
     */
    public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        // Split the list 2 array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half
        mergeSort(first);
        mergeSort(second);
        
        // Merge the halves together, overwriting the original list 2 array
        merge(first, second, list);
        return list;
    }
    /**
     * 
     * @param first
     * @param second
     * @param result 
     */
    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result list 2 array
        // Next element to consider in the first list 2 array
        int iFirst = 0;
        // Next element to consider in the second list 2 array
        int iSecond = 0;
        
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
    /**
     * 
     * @param list2 
     */
    public static void countSort(int[] list2) {
        int N = list2.length;
        if (N == 0) {
            return;
        }
        /**
         * find max and min values *
         */
        int max = list2[0], min = list2[0];
        for (int i = 1; i < N; i++) {
            if (list2[i] > max) {
                max = list2[i];
            }
            if (list2[i] < min) {
                min = list2[i];
            }
        }
        int range = max - min + 1;

        int[] count = new int[range];
        /**
         * make count/frequency list 2 array for each element *
         */
        for (int i = 0; i < N; i++) {
            count[list2[i] - min]++;
        }
        /**
         * modify count so that positions in final list 2 array is obtained *
         */
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        /**
         * modify original list 2 array *
         */
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (j < count[i]) {
                list2[j++] = i + min;
            }
        }
    }
    /**
     * 
     * @param list3
     * @return 
     */
    public static char[] bubbleSort (char[] list3){
        int list3int[] =new int[list3.length];
        
        for (int i=0; i<list3.length; i++){
            list3int[i] = (int) list3[i];
        }
        
        int n, c, d, swap;
        n=list3int.length;
        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (list3int[d] > list3int[d + 1]) /* For descending order use < */ {
                    swap = list3int[d];
                    list3int[d] = list3int[d + 1];
                    list3int[d + 1] = swap;
                }
            }
        }
        
        for (int i=0; i<list3.length; i++){
            list3[i] = (char) list3int[i];
        }
        
        return list3;
        
    }   
}
