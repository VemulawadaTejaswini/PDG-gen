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
    int odd=0;
    int odd2=0;
    for(int i=0;i<N;i++){
      if(a[i]%4==0){
        count4++;
      }
      else if(a[i]%2==0){
        count2++;
      }
      else{
        odd++;
      }
    }
    if(count2>=1){
      odd2=odd+1;
    }
    if(odd2-1<=count4){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }    
  }
}