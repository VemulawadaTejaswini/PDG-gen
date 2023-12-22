import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = (A-2)/50;
  int D = (B-2)/50;
  System.out.println("40 100");
  if(A == 1){
    for(int i = 0;i < 20;i++){
      for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
    }
  }
  else{
    if(C == 0){
      for(int i = 0;i < A-1;i++){
        System.out.print(".#");
      }
      for(int i = 0;i < 99-(A-1)*2;i++){
        System.out.print("#");
      }
      System.out.println("#");
      for(int i = 0;i < 19;i++){
        for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
      }
    }
    else if(C > 0 && C < 9){
      for(int i = 0;i < C;i++){
        for(int j = 0;j < 50;j++){
        System.out.print(".#");
      }
      System.out.println(".#");
      for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
      }
 
      for(int j = 0;j < A%50 -1;j++){
        System.out.print(".#");
      }
      for(int i = 0;i < 99 - (A%50 -1)*2;i++){
      System.out.print("#");
      }
      System.out.println("#");
      for(int i = 0;i < 18-2*C;i++){
        for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
      }
    }
    else if(C == 9){
      for(int i = 0;i < 8;i++){
        for(int j = 0;j < 50;j++){
        System.out.print(".#");
      }
      System.out.println(".#");
      for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
      }
      for(int j = 0;j < A%50 -1;j++){
        System.out.print(".#");
      }
      for(int i = 0;i < 99 - (A%50 -1)*2;i++){
      System.out.print("#");
      }
      System.out.println("#");
      for(int j = 0;j < 99;j++){
        System.out.print("#");
      }
      System.out.println("#");
    }
  }
  if(B == 1){
    for(int i = 0;i < 20;i++){
      for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
    }
  }
  else{
    for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
    if(D == 0){
      for(int i = 0;i < B-1;i++){
        System.out.print("#.");
      }
      for(int i = 0;i < 99-(B-1)*2;i++){
        System.out.print(".");
      }
      System.out.println(".");
      for(int i = 0;i < 18;i++){
        for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
      }
    }
    else if(D > 0 && D < 9){
      for(int i = 0;i < D;i++){
        for(int j = 0;j < 50;j++){
        System.out.print("#.");
      }
      System.out.println("#.");
      for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
      }
 
      for(int j = 0;j < B%50 -1;j++){
        System.out.print("#.");
      }
      for(int i = 0;i < 99 - (B%50 -1)*2;i++){
      System.out.print(".");
      }
      System.out.println(".");
      for(int i = 0;i < 17-2*D;i++){
        for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
      }
    }
    else if(D == 9){
      for(int i = 0;i < 8;i++){
        for(int j = 0;j < 50;j++){
        System.out.print("#.");
      }
      System.out.println("#.");
      for(int j = 0;j < 99;j++){
        System.out.print(".");
      }
      System.out.println(".");
      }
      for(int j = 0;j < B%50 -1;j++){
        System.out.print("#.");
      }
      for(int i = 0;i < 99 - (B%50 -1)*2;i++){
      System.out.print(".");
      }
      System.out.println(".");
    }
  }
}}
        
