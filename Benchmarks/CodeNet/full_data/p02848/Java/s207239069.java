import java.util.*;
import static java.lang.System.*;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String Alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
int N = sc.nextInt();
String S = sc.next();
String ans ="";
int longth = S.length();
for(int i=0;i<longth;i++){
	for(int j=0;j<28;j++){
    if((S.substring(i,i+1)).equals(Alphabet[j])){
    ans = ans+Alphabet[j+N];
    }
	}
}
  out.print(ans);
}
}
