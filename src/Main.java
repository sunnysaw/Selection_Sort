/*
Enter the length of array :
12
Enter the element inside array :
1 8 7 6 3 2 00 45 74 98 23 65
Printing the result :
 0 1 2 3 6 7 8 23 45 65 74 98
 */

import java.util.Scanner;

public class Main {
    static int[] Selection_Sort(int[] array){
        for (int start = 0; start < array.length; start++){
            int minIndex = start;
            for (int SecondStart = start + 1; SecondStart < array.length; SecondStart++){
                if (array[SecondStart] < array[minIndex]){
                    minIndex = SecondStart;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[start];
            array[start] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the element inside array :");
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        int[] result = Selection_Sort(array);
        for (int start = 0; start < array.length; start++){
            System.out.print(" " + result[start]);
        }
    }
}