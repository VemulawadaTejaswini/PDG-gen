import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String A=sc.next();
String B=sc.next();
if(A.length()>B.length()){
    out.println("GREATER");
}else if(A.length()<B.length()){
    out.println("LESS");
}else{
if(A.compareTo(B)>0){
    out.println("GREATER");
}else if(A.compareTo(B)<0){
    out.println("LESS");
}else{
    out.println("EQUAL");
}
}
}
}