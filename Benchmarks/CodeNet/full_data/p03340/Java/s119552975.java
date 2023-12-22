import java.util.*;

class Main{
  //listの全要素をfalseにする
  public static void listfalse(Boolean[] a){
    for(int i=0;i<a.length;i++){
      a[i]=false;
    }
    return ;
  }
  
  //listの要素のうち、argによってtrueになっていたものをfalseに戻す
  public static void fix(Boolean[] a,String arg){
    int len=arg.length();
    for(int i=len-1;i>=0;i--){
      if(arg.charAt(i)=='1'){
        a[a.length+i-len]=false;
      }
    }
    return ;
  }
  
  //listの要素のうち、argの'1'の項がすべてfalseになっていて、追加してもよいか判定する
  public static Boolean judge(Boolean[] a,String arg){
    int len=arg.length();
    for(int i=len-1;i>=0;i--){
      if(a[a.length+i-len]==true&&arg.charAt(i)=='1'){
        return false;
      }
    }
    return true;
  }
  
  //listの要素を、argの'1'と対応する項を変える
  public static void change(Boolean[] a,String arg){
    int len=arg.length();
    for(int i=len-1;i>=0;i--){
      if(arg.charAt(i)=='1'){
        a[a.length+i-len]=true;
      }
    }
  }
  
  public static void tost(Boolean[] a){
    System.out.print("{");
    for(int i=0;i<a.length;i++){
      if(a[i]==true) System.out.print("t ");
      else System.out.print("f ");
    }
    System.out.println("}");
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    String[] binA=new String[N];
    int[] ans=new int[N];
    int Ans=0;
    
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      binA[i]=Integer.toBinaryString(A[i]);
      //System.out.print(binA[i]+" ");
    }
    
    Boolean[] Check=new Boolean[21];
    listfalse(Check);
    
    int left=0;
    int right=0;
    
    for(left=0;left<N;left++){
      while(right<N){
        if(judge(Check,binA[right])){
          change(Check,binA[right]);
          tost(Check);
        }else{
          break;
        }
        right++;
      }
      fix(Check,binA[left]);
      //System.out.print(right+" ");
      ans[left]=right-left;
    }
    
    for(int i=0;i<N;i++){
      //System.out.print(ans[i]+" ");
    }
    
   System.out.print(Ans);
  }
}