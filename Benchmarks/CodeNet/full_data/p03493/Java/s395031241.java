import java.util.*;
class Main
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			
			if( a==000 ){
				System.out.println(0);
			}else if(a==111){
				System.out.println(3);
			}else if( (a==110) || (a==011) || (a==101) ){
				System.out.println(2);
			}else{
				System.out.println(1);
			}
		}
}