public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  long n = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();
 long amari =  n %  (a + b);
 long syo = n/(a+b);
 		if(amari>=a){
  	 System.out.println(a+syo*a);
 		}else{
 			  	 System.out.println(amari+syo*a);
 		}
 }
}
