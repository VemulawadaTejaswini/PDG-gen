import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      String s = sc.next();
      int lng = s.length();
      for(int i=0;i<lng;i++){
        char input = s.charAt(i);
        int charInt = input;
        charInt += n;
        if(charInt>90){
          charInt -= 26;
        }
        input = (char)charInt;
        System.out.print(input);
      }

    }
}
