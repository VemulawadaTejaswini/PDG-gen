import java.util.*;	
public class Main {	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Integer n = sc.nextInt();
      String linew = sc.nextLine();
      boolean flg = false;
      int s = 0;
      int x = 0;
      int y = 0;
      for(int i=0;i<n;i++){
        String line = sc.nextLine();
        String str[] = line.split(" ");
        s = Integer.parseInt(str[0]) - s ;
        x = Integer.parseInt(str[1]) - x ;
        y = Integer.parseInt(str[2]) - y ;

        if(s >= x+y && ((s-(x+y))%2==0)){
          flg = true;
        }else{
          flg = false;
          break;
        }    
      }
      if(flg){System.out.println("Yes");
      }else{System.out.println("No");
      }
    }
}