import java.util.Scanner;

class Main{
  public static void main(String[]args){
    
  Scanner sc=new Scanner(System.in);
  int X=sc.nextInt();
  int a=0;
  int b=0;
  int c=0;


  int[] array=new int[X];//X個の要素を持つ配列を準備
  int[] ay=new int[X];//X個の要素を持つ入力用配列を準備
  for(int i=0; i<X; i++){
        ay[i]=sc.nextInt();
        array[i]=ay[i];
    if(array[i]%2==0){//配列の要素一つ一つを確認
          if(array[i]%3==0){//3で割り切れる場合
            a++;
          }else if(array[i]%5==0){//5で割り切れる場合
            b++;
          }else{
            c++;
          }
    }else{
    }
  }
 if(a>0 || b>0){
 System.out.print("APPROVED");
 }else{
System.out.print("DENIED");
}
}
}