import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean happy = false;
		int breaking = 0;
		int next = 1;

		for(int i=0; i<N; i++){
			int a = sc.nextInt();
			if(a==next){
				next++;
				happy = true;
			}else{
				breaking++;
			}
		}
		if(happy==true){
			System.out.println(breaking);
		}else{
			System.out.println("-1");
		}
    }
}
