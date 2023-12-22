import java.util.*;
2.	class Main{
3.      public static void main(String[] args){
4.        Scanner sc = new Scanner(System.in);
5.        int k = sc.nextInt();
6.        int x = sc.nextInt();
7.        int n = 1+x-k;
8.        for(int i = 0;i < 2k-1; i++){
9.          System.out.println(n+i);
10.        }
11.      }
12.    }
