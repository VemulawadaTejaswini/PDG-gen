import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
String S=sc.next();
int h=0;
for(int i=0;i<S.length();i++){
    if(i==A){
    if(S.charAt(i)=='-')h++;
    }else {
        if(S.charAt(i)=='-'){
        h=0;break;
        }
    }
    
}
if(h==1){System.out.println("Yes");}else{System.out.println("No");}

}
}