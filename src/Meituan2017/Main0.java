package Meituan2017;

import java.util.*;

public class Main0 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(numOf(n));
    }
    public static int numOf(int n){
        if(n<=0)
            return 0;
        if(n<=2)
            return n;
        if(n>=3){
            return numOf(n-1)*2;
        }
        return 0;
    }
}
