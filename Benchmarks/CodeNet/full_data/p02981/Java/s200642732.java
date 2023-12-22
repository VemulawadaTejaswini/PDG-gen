
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
//     String nyu=sc.nextLine();


int num=Integer.parseInt(nyu[0]);
int numnext=Integer.parseInt(nyu[1]);
int numend=Integer.parseInt(nyu[2]);

if(num*numnext<numend){



System.out.println(num*numnext);
}else{
System.out.println(numend);

}

//System.out.println(a/b);


	}
}