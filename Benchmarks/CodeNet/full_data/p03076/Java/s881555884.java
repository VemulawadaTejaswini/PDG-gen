import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] a={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
    int m=0;
    for(int i=0;i<5;i++){
      m+=(a[i]+9)/10*10;
    }
    int n=0;
    for(int i=0;i<5;i++){
      n=Math.max(10-((a[i]+9)%10),n);
    }
    System.out.println(m-n+1);
  }
}