import java.io.*;
import java.util.*;
import java.lang.*;

class MyCalculator{
    public long power(int a, int b){
        int result=1;
        while(b!=0){
            result = result*a;
            b--;
        }
        return result;
    }
}

 class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           while(sc.hasNextInt()){
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(c==0 && d==0){
                System.out.println("java.lang.Exception: n and p should not be zero.");
            }
            else if
            (c<0 || d<0){
                System.out.println("java.lang.Exception: n or p should not be negative.");
            }else{
             MyCalculator obj = new  MyCalculator();
           System.out.println(obj.power(c,d));
            }
           }
    }
}
