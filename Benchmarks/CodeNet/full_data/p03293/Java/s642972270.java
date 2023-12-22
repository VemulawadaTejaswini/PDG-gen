import java.util.Scanner;
public class Main {
	public static void main(String args[]){
      	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
        String[] S = s.split(" ");
      	String t = sc.nextLine();
        String[] T = t.split(" ");
        if (S==T){
    		System.out.println("Yes");
    	}
        for (int i=0; i<S.length-1; i++){
    		for (int j=0; j<S.length-i;j++){
    			if (S[i]==T[j]){
    		        System.out.println("Yes");
    		        break;
    			}
    		}
        }
        System.out.println("No");
    }
}