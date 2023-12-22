import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    
    int[] t = new int[q];
    int[] f = new int[q];
    String[] c = new String[q];
    
    for(int i=0;i<q;i++){
      t[i] = sc.nextInt();
      if(t[i] == 2){
        f[i] = sc.nextInt();
        c[i] = sc.next();
      }
    }
    boolean flg = false;
    
    for(int j=0;j<q;j++){
      if(t[j]==1){
        flg = !flg;
      }else{
        if(f[j]==1){
          if(flg){
            s = s+c[j];
          }else{
            s = c[j]+s;
          }
        }else{
          if(flg){
            s= c[j]+s;
          }else{
            s = s+c[j];
          }
        }
      }
    }

    System.out.println(s);
      
    

  }
}