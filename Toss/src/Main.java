import java.util.*;
import java.lang.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        int tails=0;
        int heads=0;
        int c;
        int d;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
             a=random();
             if(a<0.5){
                 tails=tails+1;
             }
             else{
                 heads =heads+1;
             }
        }
        c= (int)(((float)tails /n)*100);
        d=(int)(((float)heads/n)*100);
        System.out.println("Percentage of tails: "+c);
        System.out.println("Percentage of heads: "+d);




    }
}