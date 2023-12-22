import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    String s=sc.next();
    boolean ans=true;
    String a[]=s.split("");
    for(int i=0;i<a.length;i++){
      if(i%2!=0){
        if(a[i].equals("L") || a[i].equals("U")|| a[i].equals("D")){
        }else{
          ans=false;
        }
      }else{
        if(a[i].equals("R") || a[i].equals("U")|| a[i].equals("D")){
        }else{
          ans=false;
        }
      }
    }
    if(ans==true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

	}
}
