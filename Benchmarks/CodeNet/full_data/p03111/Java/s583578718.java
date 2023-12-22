import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int[] l=new int[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    int all[]=new int[n];
    int min=Integer.MAX_VALUE;
    Arrays.fill(all,0);
    do{
      min=Math.min(calc2(all,a,b,c,l),min);
    }while(calc(all));
    System.out.println(min);
  }
  static int calc2(int[] all,int a,int b,int c,int[] l){
    int marge=0;
    int n[]={0,0,0,0};
    for(int i=0;i<all.length;i++){
      if(all[i]!=0&&n[all[i]]!=0){
        marge+=10;
      }
      n[all[i]]+=l[i];
    }
    if(n[1]==0||n[2]==0||n[3]==0){
      return Integer.MAX_VALUE;
    }
    return Math.abs(a-n[1])+Math.abs(b-n[2])+Math.abs(c-n[3])+marge;
  }
  static boolean calc(int[] all){
    boolean res=false;
    for(int i=0;i<all.length;i++){
      if(all[i]==3){
        all[i]=0;
      }else{
        all[i]++;
        res=true;
        break;
      }
    }
    return res;
  }
}