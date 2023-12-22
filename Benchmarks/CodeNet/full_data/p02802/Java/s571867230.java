import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int ac_count = 0;
    int wa_count = 0;
    Integer[] ac_list = new Integer[m];
    Integer[] p = new Integer[m];
    String[] s = new String[m];

    for(int i=0; i<m; i++){
      p[i] = sc.nextInt();
      s[i] = sc.next();
    }

    for(int j=0; j<m; j++){
     if(!(Arrays.asList(ac_list).contains(p[j]))){
       if(s[j].equals("AC")){
         ac_count += 1;
         ac_list[j] = p[j];

       }else if(s[j].equals("WA")){
         wa_count += 1;
       }
     }
    }

    System.out.println(ac_count + " " + wa_count);
  }
}