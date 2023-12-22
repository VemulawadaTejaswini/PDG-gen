import java.util.Scanner;

class Main{
  public static void main(String[]args){
    
  Scanner sc=new Scanner(System.in);
  int X=sc.nextInt();
  
  int[] araay=new int[X];//X個の要素を持つ配列を準備
  for(int i=0; i<X; i++){
    if(araay[i]%2==0){//配列の要素一つ一つを確認
          if(araay[i]%3==0){//3で割り切れる場合
            System.out.println("APPROVED");
          }else if(araay[i]%5==0){//5で割り切れる場合
            System.out.println("APPROVED");
          }else{
            System.out.println("DENIED");
          }
    }else{
      System.out.println("DENIED");
    }
  }
 }
}