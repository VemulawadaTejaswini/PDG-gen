import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int a[]=new int[num];
    int b[]=new int[num];
    for(int x=0; x<num;x++){
      a[x]=scan.nextInt();
    }
    for(int x=0; x<num; x++){
      b[x]=scan.nextInt();
    }
    System.out.println(Math.abs(count(a,num)-count(b,num)));
  }
  public static int count(int array[], int num){
    int count=0, Ans=0;
    for(int x=0; x<array.length-1; x++){
      count=0;
      for(int y=x+1; y<array.length; y++){
        if(array[x]>array[y]){
          count++;
        }
      }
      //System.out.println(count);
      Ans+=count*stair(num-x-1);
    }
    return Ans;
  }
  
  public static int stair(int in){
    int count=1;
    for(int x=in; x>1; x--){
      count*=x;
    }
    return count;
  }
}