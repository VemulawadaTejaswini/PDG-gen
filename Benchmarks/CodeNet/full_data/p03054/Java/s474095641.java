import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    int ay = sc.nextInt();
    int ax = sc.nextInt();
    
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
      	String b = sc.next();
      	if(b.equals("L")){
        	ax--;
      	}else if(b.equals("R")){
        	ax++;
      	}else if(b.equals("U")){
        	ay--;
      	}else if(b.equals("D")){
        	ay++;
      	}
      }
    }
    
    if(ax>=1 && ax<=W && ay>=1 && ay <=H){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    
  }
}