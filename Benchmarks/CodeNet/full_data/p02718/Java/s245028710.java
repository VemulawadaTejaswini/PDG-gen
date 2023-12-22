import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	String line = sc.nextLine();
      	String tab[] = line.split(" ");
      	int sum = 0;
      	for(int i = 0 ; i < tab.length; i++){
          sum+=Integer.parseInt(tab[i]);
        }
      	int ans =0;
      	for(int i = 0 ; i < tab.length; i++){
        	if( Integer.parseInt(tab[i]) >= (int) 1 / (4*m)){
            	ans++;
            }
        }
        System.out.println((ans == m) ? "Yes" : "No");
	}
}