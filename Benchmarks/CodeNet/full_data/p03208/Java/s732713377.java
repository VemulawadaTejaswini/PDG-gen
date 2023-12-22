package atCoder115;

import java.util.Scanner;
import java.util.*;

class ABC115C {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        int n = scanner1.nextInt();
        int k = scanner2.nextInt();

        Scanner scannerh = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        int a;
        int h[] = new int[n];
        
        for(int i=0;i < n;i++){
          a = scannerh.nextInt();
          h[i] = a;
        }
        Arrays.sort(h);
        
        int ans=2000000000;
        int ansi;
        for(int i = 0;i < (n-k+1);i++){
          ansi = h[i+k-1]-h[i];
          if(ansi < ans){
            ans=ansi;
          } 
        }
  }
}
