
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    String S = sc.next();
    int Rc[] = new int[K+1];//i文字目までのRの数
    int Gc[] = new int[K+1];//i文字目までのGの数
    int Bc[] = new int[K+1];//i文字目までのBの数
    Rc[0]=0;
    Gc[0]=0;
    Bc[0]=0;
    long ans =0;
    for(int i=0;i<K;i++){
      if(S.substring(i,i+1).equals("R")){
        Rc[i+1]=Rc[i]+1;
        Gc[i+1]=Gc[i];
        Bc[i+1]=Bc[i];
      }else if(S.substring(i,i+1).equals("G")){
        Gc[i+1]=Gc[i]+1;
        Rc[i+1]=Rc[i];
        Bc[i+1]=Bc[i];
      }else{
        Bc[i+1]=Bc[i]+1;
        Rc[i+1]=Rc[i];
        Gc[i+1]=Gc[i];
      }
    }
    for(int i=1;i<K+1;i++){
      //i文字目がR⇒(後ろのGの数＊後ろのBの数)-(i+t文字目,i+2t文字目)が(G,B)or(B,G)を満たすtの数
      //∴O(K^2)で解ける
      if(S.substring(i-1,i).equals("R")){
        ans=ans+((Gc[K]-Gc[i])*(Bc[K]-Bc[i]));
        for(int j=1;j<=((K-i)/2);j++){
          if((S.substring(i+j-1,i+j).equals("G")&&S.substring(i+j+j-1,i+j+j).equals("B"))||(S.substring(i+j-1,i+j).equals("B")&&S.substring(i+j+j-1,i+j+j).equals("G"))){
            ans=ans-1;
          }
        }
      }else if(S.substring(i-1,i).equals("G")){
        ans=ans+((Rc[K]-Rc[i])*(Bc[K]-Bc[i]));
        for(int j=1;j<=((K-i)/2);j++){
          if((S.substring(i+j-1,i+j).equals("R")&&S.substring(i+j+j-1,i+j+j).equals("B"))||(S.substring(i+j-1,i+j).equals("B")&&S.substring(i+j+j-1,i+j+j).equals("R"))){
            ans=ans-1;
          }
        }
      }else if(S.substring(i-1,i).equals("B")){
        ans=ans+((Gc[K]-Gc[i])*(Rc[K]-Rc[i]));
        for(int j=1;j<=((K-i)/2);j++){
          if((S.substring(i+j-1,i+j).equals("G")&&S.substring(i+j+j-1,i+j+j).equals("R"))||(S.substring(i+j-1,i+j).equals("R")&&S.substring(i+j+j-1,i+j+j).equals("G"))){
            ans=ans-1;
          }
        }
      }else{

      }
    }

    System.out.println(ans);
  }



    
    

  //最大公約数・最小公倍数（セットで使う）
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
  static int lcm (int a, int b) {return a*b/gcd(a,b);}
  
}
