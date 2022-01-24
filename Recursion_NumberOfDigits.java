import java.util.Scanner;

public class Recursion_NumberOfDigits {
    static int sum =1;
    public int Digits(int n)
    {

        if(n<10)
        {
            return 1;
        }
        return sum + Digits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Recursion_NumberOfDigits ob = new Recursion_NumberOfDigits();
        System.out.println(ob.Digits(n));
    }
}
