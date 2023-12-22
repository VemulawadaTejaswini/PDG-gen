import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		char[][] ch = new char[i][j];
		String[] s = new String[i];
		sc.nextLine();
		for(int a=0;a<i;a++) {
			s[a] = sc.nextLine();
		}
		for(int a=0;a<i;a++) {
			char[] tmp = s[a].toCharArray();
			for(int b=0;b<j;b++){
			    ch[a][b]=tmp[b];
			}
		}
		int test = 0;
		int num = 0;
		while(test < i*j){
		    test = 0;
    		for(int a=0;a<i;a++) {
    			for(int b=0;b<j;b++){
    			    if(ch[a][b]=='#'){
    			        if(a!=0){ch[a-1][b]='#';}
    			        if(a!=i-1){ch[a+1][b]='#';}
    			        if(b!=0){ch[a][b-1]='#';}
    			        if(b!=j-1){ch[a][b+1]='#';}
    			        test++;
    			    }
    			}
    		}
    		num++;
		}
		
		
		System.out.println(num);
	}
}
