import java.util.Scanner;

public class RecursionSum_ArrayElements {
    static int i=0;
    static int sum=0;
    int Sum(int arr[], int n)
    {
        if(i==n-1)
        {
            sum = sum + arr[i];
        }
        else {
            sum = sum + arr[i];
            i = i + 1;
            Sum(arr, n);

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RecursionSum_ArrayElements ob = new RecursionSum_ArrayElements();
        System.out.println(ob.Sum(arr,n));
    }
}
