import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
  	int b=sc.nextInt();
  	int t=1;
   	int c=0;
    while(t<b){
    t+=a-1;
    c++;
    }
    System.out.println(c);
    }
}