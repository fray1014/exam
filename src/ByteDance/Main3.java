package ByteDance;

import java.util.*;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        int result=0;
        try{
            result=calc(line);
        }
        catch(ArithmeticException ae){

        }finally {
            System.out.print(result);
        }
    }

    public static int calc(String statement){
        char[] c=statement.toCharArray();
        Stack<Character> stack=new Stack<>();
        int tmp=0;
        if(c[0]=='-') {
            stack.push('0');
            stack.push('-');
            tmp++;
        }
        int sum=0;
        String[] str=statement.split("\\+");
        for(int i=0;i<str.length;i++){
            sum+=Integer.parseInt(str[i]);
        }
        return sum;
    }
    public static int calcPart(String statement){
        Stack<Integer> s1=new Stack<>();
        char[] c=statement.toCharArray();
        return 0;
    }
}
