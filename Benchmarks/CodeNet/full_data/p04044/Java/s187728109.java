// Iroha Loves Strings

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int L=sc.nextInt();
    String[] array=new String[N];
    for(int i=0;i<N;i++){
      array[i]=sc.next();
    }

    String ans="";
    sort(array,N,L);
    for(int i=N-1;i>=0;i--){
      ans+=array[i];
    }
    System.out.println(ans);
  }

  public static void sort(String[] array,int N,int L){
    for(int i=0;i<N-1;i++){
      int index=i;
      for(int j=i+1;j<N;j++){
        for(int s=0;s<L;s++){
          if((array[j].charAt(s))>(array[index].charAt(s))){
            index=j;
            break;
          }
        }
      }
      if(i!=index){
        String temp=array[index];
        array[index]=array[i];
        array[i]=temp;
      }
    }
  }
}
