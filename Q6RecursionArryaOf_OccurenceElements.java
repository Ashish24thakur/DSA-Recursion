import java.util.Scanner;

public class Q6RecursionArryaOf_OccurenceElements {
    static int i=0;
    static int a[] = new int[5];
    static int[] Occurence(int arr[] , int currentindex , int searchelements)
    {
        if(currentindex == arr.length - 1)
        {
            if(arr[currentindex]==searchelements)
            {
                a[i]=currentindex;
                i++;
            }
        }
        else{
            if(arr[currentindex]==searchelements)
            {
                a[i] = currentindex;
                i = i+1;
                Occurence(arr,currentindex+1,searchelements);
            }
            else
                Occurence(arr,currentindex+1,searchelements);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int []k=Occurence(arr,0,search);
        int j=0;
        while(k[j]!=0)
        {
            System.out.println(k[j]);
            j++;

        }
    }
}
