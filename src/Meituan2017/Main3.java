package Meituan2017;
import java.util.*;
public class Main3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();

        int max=0;
        int[][] dp=new int[a.length()][b.length()];
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    if (i == 0 || j == 0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j]>max)
                        max=dp[i][j];
                }
            }

        }
        System.out.println(max);
    }

}
