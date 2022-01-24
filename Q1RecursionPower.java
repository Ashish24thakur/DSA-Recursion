/* Question 1
        . Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
        Do this recursively.
        Input format :
        Two integers x and n (separated by space)
        Output Format :
        x^n (i.e. x raise to the power n)
        Sample Input 1 :
        3 4
        Sample Output 1 :
        81

 */

import java.util.Scanner;

class Recursion_Power{
    int pow(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        return a* pow(a,b-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        Recursion_Power ob = new Recursion_Power();
        System.out.println(ob.pow(m,n));
    }
}
