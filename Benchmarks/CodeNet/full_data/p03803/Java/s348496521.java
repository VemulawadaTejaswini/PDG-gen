import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] cp={0,13,1,2,3,4,5,6,7,8,9,10,11,12};
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
if(cp[a]>cp[b]){
    out.println("Alice");
}else if(cp[a]==cp[b]){
    out.println("Draw");
}else{
    out.println("Bob");
}
}}