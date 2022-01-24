import java.util.Scanner;

public class RecursionSearch_ArrayElement {

    void Search(int arr[], int currentindex, int searchvalue) {
        try {
            if (arr[currentindex] == searchvalue) {
                System.out.println(currentindex);
            } else
                Search(arr, currentindex + 1, searchvalue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        RecursionSearch_ArrayElement ob = new RecursionSearch_ArrayElement();
        ob.Search(arr, 0, search);
    }
}