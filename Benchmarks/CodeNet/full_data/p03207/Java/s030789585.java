package atCoder115;

import java.util.Scanner;
class ABC115B {
  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください。");
        int n = scanner.nextInt();
        int p[] = new int[n];
        Scanner scanner2 = new Scanner(System.in);
        int a;
        int max = 0;
        for(int i=0;i < n;i++){
          a = scanner2.nextInt();
          p[i] = a;
          if(max < p[i]){
            max = p[i];
          }
        }
        for(int i=0;i < n;i++){
          while((p[i]<100 || p[i]>10000) && p[i]%2==1){
            p[i] = (int)Math.random()*10000;
          }
        }
        int sum = 0;
        int counter = 1;
        for(int i=0;i < n;i++){
          if(p[i] == max && counter ==1){
            sum = sum+(p[i]/2);
            counter--;
          }else{
            sum = sum + p[i];
          }
        }
        System.out.println(sum);
  }
 }
