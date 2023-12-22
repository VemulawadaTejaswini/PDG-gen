import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    if(a>b+w||b>a+w){
    out.println(min(abs(a+w-b),abs(b+w-a)));
}else{
        out.println(0);
    }
}
}