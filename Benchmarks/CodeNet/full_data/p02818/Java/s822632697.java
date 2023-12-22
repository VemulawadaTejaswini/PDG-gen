import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long kcookie = sc.nextLong();
            long acookie = sc.nextLong();
            long count = sc.nextLong();
            for(long i = 0; i < count; i++){
              if(kcookie >= 1){
                kcookie--;
              } else if(kcookie == 0 && acookie >=1){
                acookie--;
              }
            }
            System.out.print(kcookie + " ");
            System.out.println(acookie);
            }
}
