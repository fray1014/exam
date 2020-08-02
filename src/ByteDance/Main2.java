package ByteDance;

import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        s.nextLine();
        String line=s.nextLine();
        String[] nums=line.split(" ");
        LinkedList<String> positive=new LinkedList<>();
        LinkedList<String> negative=new LinkedList<>();
        for(String str:nums){
            if(str.contains("-"))
                negative.offer(str);
            else
                positive.offer(str);
        }

        StringBuilder result=new StringBuilder();
        while(!positive.isEmpty()&&!negative.isEmpty()){
            result.append(positive.poll()+" "+negative.poll()+" ");
        }
        if(positive.isEmpty()&&!negative.isEmpty()){
            while(!negative.isEmpty()){
                result.append(negative.poll()+" ");
            }
        }else if(!positive.isEmpty()&&negative.isEmpty()){
            while(!positive.isEmpty()){
                result.append(positive.poll()+" ");
            }
        }
        result.delete(result.length()-1,result.length());
        System.out.print(result);

    }
}
