
import java.util.Scanner;

class  MyArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        String[] strArray = new String[]{"", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};


        Scanner sc = new Scanner(System.in);
        System.out.println("please input number between 1-7");
        int index = sc.nextInt();
        System.out.println("the weekday you want is " +strArray[index]);
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if (i <= arr.length-1) {
                System.out.print(arr[i] +", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }


    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void reverse(int[] arr) {
        for (int start=0,end=arr.length; start<=end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }


    public static int indexOfArray(int[] arr, int key) {
        int index = -1;
        for (int i=0; i<arr.length; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }


    //public static void OrderOfArray(int[] arr) {

    //}

}