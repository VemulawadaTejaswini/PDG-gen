import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        if(line.length()%2 == 0){
          boolean judge = true;
          for(int i = 0; i < line.length()/2; i+=2){
            if(!line.substring(i, i+2).equals("hi")){
              judge = false;
            }
          }
          if(judge == true)
            System.out.println("Yes");
          else
            System.out.println("No");
        }else{
          System.out.println("No");
        }
    }
}