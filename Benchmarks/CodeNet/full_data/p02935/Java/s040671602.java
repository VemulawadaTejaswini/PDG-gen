import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int[] num=new int[x];
    double Ans=0;
    for(int a=0; a<x; a++){
      num[a]=scan.nextInt();
    }
    int max1=0, max2=0;
    for(int a=0; a<x; a++){
      if(max1<num[a]){
        max2=max1;
        max1=num[a];
      }else if(max2<num[a] && max1>=num[a]){
        max2=num[a];
      }
      Ans=(max1+max2)/2.0;
    }
    System.out.println(Ans);
  }
}