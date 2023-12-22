import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int numb=b-a;
int temp=0;
for(int i=1;i<=numb-1;i++){
    temp+=i;
}
System.out.println(temp-a);
}
}