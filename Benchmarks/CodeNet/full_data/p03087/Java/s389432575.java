import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    String s=sc.next()+"#";
    int[] a=new int[n+1];
    for(int i=0;i<n;i++){
      a[i+1]=a[i];
      if(s.charAt(i)=='A'&&s.charAt(i+1)=='C'){
        a[i+1]++;
      }
    }
//    System.out.println(Arrays.toString(a));
    for(int i=0;i<q;i++){
      int f=sc.nextInt();
      int t=sc.nextInt();
      if(a[t]!=a[t-1]){
        System.out.println(a[t]-a[f-1]-1);
      }else{
        System.out.println(a[t]-a[f-1]);
      }
    }
  }
}