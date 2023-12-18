public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
double y=(double)x;
y=Math.pow(y,3);
x=(int)y;
System.out.println(x);
}
}
