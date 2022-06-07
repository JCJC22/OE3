// John Carlo M. Barrera
//BSIT2-1
import java.util.*;

public class SortExample{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please how many inputs : ");
        int x =in.nextInt(); 

        int[] inputs = new int [x];

        for(int i=0; i<x; i++){
            System.out.println("Please Enter the Elements : ");
            inputs[i]=in.nextInt();
        }
          //Display Unsorted
          System.out.println("Unsorted List" + Arrays.toString(inputs));
          bubbleSort(inputs);
          // Display Sorted 
          //Output(inputs);
          System.out.println("Bubble Sort List" + Arrays.toString(inputs));
          
          // for binary search
          System.out.print("\nEnter number you want to find : ");
          int find = in.nextInt();
          binarySearch(inputs, find);
    } // end of main method


    static void bubbleSort(int[] inputs){
        for(int i=0; i<inputs.length; i++){

            boolean flag= false;

            for(int j=0; j<inputs.length-1; j++){
                if (inputs[j]>inputs[j+1])
                {
                    flag = true;
                    int temp = inputs[j+1];
                    inputs[j+1] = inputs[j];
                    inputs[j] = temp; 
                }
            }
            if (!flag){
                return;
            }
        }
    }// end of bubblesort
    static void Output(int[] inputs){
        int n = inputs.length;
        for(int i=0; i <n; i++){
            System.out.print(inputs[i] + " ");

        }
    } // end of Output

    // Binary search
    static public void binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (numbers[middle] == value) {
                System.out.println("The number " + value + " is at position "
                        + middle + " in the bubble sorted list");
                return;
            }
            if (numbers[middle] < value) {
                low = middle + 1;
            }
            if (numbers[middle] > value) {
                high = middle - 1;
            }
        }
        System.out.println("\nThe number " + value + " is not in the list");

    }
}