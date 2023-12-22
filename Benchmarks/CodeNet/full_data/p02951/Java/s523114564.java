
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();


int num=Integer.parseInt(nyu[0]);
int numnext=Integer.parseInt(nyu[1]);
int numend=Integer.parseInt(nyu[2]);

//numend-(num-numnext)

//int num2=Integer.parseInt(sn[1]);

int count=0;

if(num-numnext<0){
count=0;
}else{
count=num-numnext;
}



System.out.println(numend-count);

//System.out.println(a/b);


	}
}