import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			String s=sc.next();
			int max=0;
			int x=0;
			for (int i=0;i<n;i++){
				if(s.substring(i,i+1).equals("I")){
					x++;
					if(x>max){
						max=x;
					}
				}
				if(s.substring(i,i+1).equals("D")){
					x--;
				}
			}
			System.out.println(max);
	}

}
