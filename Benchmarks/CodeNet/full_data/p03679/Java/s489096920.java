import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int x = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
String ans="";
if(a-b>=0){ans="delicious";
}else if(b-a<=x){ans="safe";
}else{ans="dangerous";}
    out.println(ans);
}
}