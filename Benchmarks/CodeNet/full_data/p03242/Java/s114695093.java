    import java.util.*;
    import static java.lang.System.*;

public class Main {

  public static void main(String[] args){
            Scanner sc = new Scanner(in);
            String s=sc.next();
            s=s.replace("9","-");
            s=s.replace("1","9");
            s=s.replace("-","1");
            out.println(s);
        }
    }