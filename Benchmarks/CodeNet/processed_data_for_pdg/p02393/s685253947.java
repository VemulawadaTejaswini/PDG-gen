 import java.util.Arrays;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]);
  	int b = Integer.parseInt(strAry[1]);
  	int c = Integer.parseInt(strAry[2]);
    int d;
  	if ( a>b ) { d=a;a=b;b=d;}
	if ( b>c) { d=b; b=c;c=d;}
 	if ( a>b ) { d=a;a=b;b=d;}
System.out.println( a +" "+ b +" "+c);
  } 
}
