import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	int charSize = s.length()-2;
      	List<String> moziList = new ArrayList<>();
      	for(int x=1; x <= charSize+2; x++) {
      	    moziList.add(s.substring(x-1,x));
      	}
      	int y = 0;
      	for(int x = 1; x <=charSize; x++) {
          String t = s.substring(x-1, x+2);
          if (t.equals("ABC")) {
            y++;
            
            moziList.set(x-1,"B");
            moziList.set(x,"C");
            moziList.set(x+1,"A");
            StringBuilder sb = new StringBuilder();
            for(String z: moziList) {
                sb.append(z);
            }
            s = sb.toString();
            
            if(x!=1) {
                x-=2;
            }
          }
        }
          System.out.println(y);
    }
}