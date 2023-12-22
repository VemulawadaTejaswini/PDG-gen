import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int[] t= new int[a];
      boolean ok = true;
      for(int i = 0;i<a;i++){
        t[i] = sc.nextInt();
      }
      for(int i = 0;i<a-1;i++){
        for(int j = i+1;j<a;j++){
        if(t[i]==t[j]){
          ok=false;
          break;
        }
        }
        if(!ok)break;
      }
      if(ok)System.out.println("YES");
      else System.out.println("NO");
    }
}