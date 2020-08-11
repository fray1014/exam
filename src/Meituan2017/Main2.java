package Meituan2017;

import java.util.*;

public class Main2 {
    //函数参数：数组，开始下标，结束下标，当前面积最大值，初始化送-1，找高度最小的递归
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String tmp=s.nextLine();
        String[] str=s.nextLine().split(" ");
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=Integer.parseInt(str[i]);
        }
        int maxArea = -1;
        for(int i = 0;i<n;i++){
            int left=i;
            int right=i;

            //计算以当前值为最小高度的矩形面积
            while(left > 0 && height[left-1] >= height[i])  left--;//寻找左边界
            while(right < n-1 && height[right+1] >= height[i])  right++;//寻找右边界
            int tempArea = (right-left+1) * height[i];

            if(maxArea<tempArea) maxArea=tempArea;
        }
        System.out.println(maxArea);
    }
}
