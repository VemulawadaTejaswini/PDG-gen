import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[][] ch=new char[2][3];
    ch[0]=sc.next().toCharArray();
    ch[1]=sc.next().toCharArray();
    int f=0;
    for(int i=0;i<3;i++){
      if(ch[0][i]==ch[1][2-i]){
        f++;
      }
    }
    if(f==3){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
}
