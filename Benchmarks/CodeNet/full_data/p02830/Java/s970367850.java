import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        String R = "";
        
        for(int i=0;i<N;i++) {
        	R =R+ S.charAt(i) + T.charAt(i);
        }

        System.out.println(R);   
        

    }
}

