import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  long k = sc.nextLong();
  if(k <= 9){
    for(long i = 1;i <= k;i++){
      System.out.println(i);
    }
  }
  else{
  if(k % 9 ==0){
    long a = k/9;
    for(long i = 1;i <= 9;i++){
      System.out.println(i);
    }
    for(long i = 1;i < a;i++){
      for(long j = 1;j <= 9;j++){
        System.out.println((long)((j+1)*Math.pow(10,i) -1));
      }
    }
  }
  else if(k <= 17){
     for(int i = 1;i <= 9;i++){
      System.out.println(i);
    }
    for(long j = 1;j <= k-9;j++){
        System.out.println((j+1)*10 -1);
      }
  }
    else{
      for(int i = 1;i <= 9;i++){
      System.out.println(i);
    }
      long a = k/9;
      for(long i = 1;i < a;i++){
      for(int j = 1;j <= 9;j++){
        System.out.println((long)((j+1)*Math.pow(10,i) -1));
      }
    }
      long b = k % 9;
      for(int j = 1;j <= b;j++){
        System.out.println((long)((j+1)*Math.pow(10,a) -1));
      }
    }
  }
}}