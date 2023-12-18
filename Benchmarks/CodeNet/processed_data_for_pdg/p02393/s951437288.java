public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int a=stdIn.nextInt(), b=stdIn.nextInt(), c=stdIn.nextInt(),d;
    if (!(a<b)){
	d=a;
	a=b;
	b=d;
    }
    if (!(a<c)){
	d=a;
	a=c;
	c=d;
    }
    if (!(b<c)){
	d=b;
	b=c;
	c=d;
    }
    System.out.println(a+" "+b+" "+c);
  }
}
