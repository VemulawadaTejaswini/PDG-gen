import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
      	int i;
      	int j = 0;
      

      
      	char[] ss = S.toCharArray();
      
      	
      
	for (i=0;i<N-2;i++){
        	if(ss[i] == 'A'){
            	if(ss[i+1] == 'B'){
                	if(ss[i+2] == 'C'){
                		j++;
                	}
                }
            }
        }
      
      System.out.print(j);
      
	return;

	}
}