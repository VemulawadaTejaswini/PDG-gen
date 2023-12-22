import java.util.Scanner;
class Main{
    public static void main(String[]args){
      Scanner stdIn=new Scanner(System.in);
      System.out.println("硬貨A:");
      int a=stdIn.nextInt();
      System.out.println("硬貨B:");
      int b=stdIn.nextInt();
      System.out.println("商品の値段");
      int c=stdIn.nextInt();
      if(1<=a && a<=500 && 1<=b && b<=500 && 1<=c && c<=1000){
        if(a+b>=c){
          System.out.println("Yes");
        }else
        System.out.println("No");
      }else
      System.out.println("硬貨は1円以上500円以下商品の値段は1円以上1000円以下です。");
}
}
