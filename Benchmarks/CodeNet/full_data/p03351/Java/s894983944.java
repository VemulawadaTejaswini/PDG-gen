import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int d=Integer.parseInt(sc.next());
if((dist(a,b)<=d&&dist(b,c)<=d)||dist(a,c)<=d){

System.out.println("Yes");}else{
System.out.println("No");
}

}
private static int dist(int person1,int person2){
return Math.abs(person2-person1);
}
}