import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String str=String.valueOf(n);
    int nArray[]=new int[str.length()+1];
    int d[]=new int[k];
    for(int i=0;i<k;i++){
      d[i]=sc.nextInt();
    }
    sc.close();

    //nを一文字ずつに分裂。
    for(int i=1;i<nArray.length;i++){
      nArray[i]=Integer.parseInt(str.substring(i-1,i));
    }
    //操作
    for(int i=nArray.length-1;i>=1;i--){
      //桁上がり対策
      if(nArray[i]==10){
        nArray[i-1]++;
        nArray[i]=0;
      }

      for(int j=0;j<k;j++){
        if(nArray[i]==d[j]){
          if(nArray[i]==9){
            nArray[i]=0;
            nArray[i-1]++;
            continue;
          }else{
            nArray[i]++;
            continue;
          }
        }
      }
    }

    //出力
    if(nArray[0]==0){
      for(int i=1;i<nArray.length;i++){
        System.out.print(nArray[i]);
      }
      System.out.println();
    }else{
      for(int i=0;i<nArray.length;i++){
        System.out.print(nArray[i]);
      }
      System.out.println();
    }
  }
}