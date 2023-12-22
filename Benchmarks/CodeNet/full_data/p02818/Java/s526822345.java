import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int kcookie = sc.nextInt();
            int acookie = sc.nextInt();
            int count = sc.nextInt();
            for(int i = 0; i < count; i++){
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