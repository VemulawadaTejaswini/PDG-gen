import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int c=GCD(a,b);
	
	BitSet p=new BitSet();
	p.set(1);
	int tmp=2;
	while(!isPrime(c)){
		for(int i=tmp;i<=c/2;i++){
			if(c%i==0){
				c=c/i;
				p.set(i);
				tmp=i;
				break;
			}
		}
	}p.set(c);

	System.out.println(p.cardinality());
 }
 
  public static boolean isPrime(int n){//素数かどうか
	if(n<3)return n>0?true:false;
    int m=n/2;
	if(m<2)return true;
	if(n%m==0)return false;
	m=(int)Math.floor(Math.sqrt((double)n));
	while(m>2){
		if(n%m==0)return false;
		m--;
	}
	return true;
  }
  
  public static int GCD(int x,int y){//最大公約数
	 int tmp;
	 if(y>x){tmp=x;x=y;y=tmp;}
     while((tmp=x%y)!=0){x=y;y=tmp;}
	 return y;
 }

}