import java.util.Scanner;

public class Q2Increasing_Ordr {
    public static int strt=1;
    void order(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(strt + " ");
        strt = strt + 1;
        order(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int strt = sc.nextInt();
        int n = sc.nextInt();
        Q2Increasing_Ordr ob = new Q2Increasing_Ordr();
        ob.order(n);
    }
}
