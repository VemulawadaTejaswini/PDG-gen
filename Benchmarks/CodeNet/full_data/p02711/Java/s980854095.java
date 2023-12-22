import java.util.Scanner;
public class Main {
		public static void main(String args[]){
		int N[]=new int[3];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<N.length;i++){
		N[i]= sc.nextInt();
        } 
        if(N[0]==7||N[1]==7||N[2]==7){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}