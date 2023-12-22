import java.util.Scanner;
public class Main {

	public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int N;//広告の縦横
int H;//high
int W;//wide
int H1;//high1
int W1;//wide1
N=scan.nextInt();
H=scan.nextInt();
W=scan.nextInt();
if(N%W==0){
W1=N/W;
}else{
W1=N%W;
W1=W1+1;
}
if(N%H==0){
H1=N/H;
}else{
H1=N%H;
H1=H1+1;
}
System.out.println(H1);
System.out.println(W1);
System.out.println(H1*W1);

	scan.close();
	}
}