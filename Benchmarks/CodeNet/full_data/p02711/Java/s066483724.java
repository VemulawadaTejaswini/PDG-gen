import java.io.*;
import java.util.*;
public class Main{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]){
        ans();
    }
    public static void ans(){
        int n=scn.nextInt();
        boolean flag=false;
        while(n>0){
            int a=n%10;
            if(a==7){
                System.out.print("Yes");
                flag=true;
                break;
            }
            n/=10;
        }
        if(flag==false)
        System.out.print("No");
    }
}