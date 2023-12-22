import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		sc.close();
		int count = 0;
		String s[] = S.split("");
		
        for(int i = 1; i < N; i++) {
	    	if(s[i].equals("E")) {
	    		count ++;
	    	}
        }
		
        int min = count;
        for(int j = 1; j < N; j++) {
    		if( s[j-1].equals("W")) {
        		count++;
        	}
    		if( s[j].equals("E")) {
        		count--;
        	}
    		min = Math.min(min, count);	
        }
		System.out.println(min);
	}
}