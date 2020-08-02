package ByteDance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**统计二进制1的个数*/
public class Main1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=s.nextInt();
        }
        int[] result=countOnes(num);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] countOnes(int[] num){
        int[] ret=new int[num.length];
        for(int i=0;i<num.length;i++){
            ret[i]=countOne(num[i]);
        }
        return ret;
    }

    public static int countOne(int input){
        int sum=0;
        for(int i=1;i<=input;i++){
            int tmp=i;
            while(tmp!=0){
                if(tmp%2==1)
                    sum++;
                tmp=tmp>>1;
            }
        }
        return sum;
    }
}
