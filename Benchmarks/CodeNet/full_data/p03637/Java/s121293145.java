import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] a=new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
    }
    int count4=0;
    int count2=0;
    for(int i=0;i<N;i++){
      if(a[i]%4==0){
        count4++;
      }
      else if(a[i]%2==0){
        count2++;
      }
    }

    if(count4>=N/2){
      System.out.println("Yes");
    }
    else if(count2==N){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}