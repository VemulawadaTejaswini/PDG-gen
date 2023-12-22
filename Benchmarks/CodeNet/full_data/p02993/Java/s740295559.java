import java.util.regex.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   //   String[] nyu=sc.nextLine().split("");
     String nyu=sc.nextLine();

String str = nyu;
String[] regex = new String[10];
for(int i=0;i<10;i++){
regex[i]="(.)*"+i+"{2,}(.)*";

}

int flag=0;

for(int i=0;i<10;i++){
Pattern p = Pattern.compile(regex[i]);
Matcher m = p.matcher(str);

if (m.find())flag++;

}


if (flag>0) {
 System.out.println("Bad");
} else {
 System.out.println("Good"); // → こちら
}


//int num=Integer.parseInt(nyu);
//int numnext=Integer.parseInt(nyu[1]);
//int numend=Integer.parseInt(nyu[2]);

//System.out.println(numend);

//System.out.println(a/b);


	}
}