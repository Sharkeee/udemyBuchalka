import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntarray = getIntegers(5);
        int[] sorted = sortArray(myIntarray);
        printArray(sorted);
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
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }

        boolean flag = true;
        int temp = 0;
        while (flag) {

            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
    return sortedArray;
    }

}