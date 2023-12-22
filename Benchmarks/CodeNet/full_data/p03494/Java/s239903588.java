import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;n>i;i++){
      a[i]=sc.nextInt();
    }
    int counter=0;
    for(int i=0;n>i;i++){
     if(a[i]%2==0){
      for(int j=0;n>j;j++){
        a[j]/=2;
      }
    }else{
      break;
    }
    counter++;
  }
      System.out.println(counter);
  }
}