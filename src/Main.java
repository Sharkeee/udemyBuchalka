import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntarray = getIntegers(3);
        printArray(myIntarray);
        sortArray(myIntarray);
        printArray(myIntarray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values: \r");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array Element [" + i + "] value is: " + array[i]);
        }
    }

    public static int[] sortArray(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        for(int i = 0; i<sortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }

        int sorting = 1;
        int temp = 0;
        while(sorting == 1) {

            for(int i = 0; i<unsortedArray.length;i++) {
                if(unsortedArray[i] < unsortedArray[i+1]) {
                    sorting = 1;
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                }
                sorting = 0;
            }
        }

        return sortedArray;
    }

}