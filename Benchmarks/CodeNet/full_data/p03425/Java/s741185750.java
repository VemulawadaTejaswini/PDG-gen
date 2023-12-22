import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] MARCH = new int[5];
    	long ans = 0;
    	for(int i = 0; i < N; i++){
    		char ch = sc.next().charAt(0);
    		switch(ch){
    		case 'M' : MARCH[0]++; break;
    		case 'A' : MARCH[1]++; break;
    		case 'R' : MARCH[2]++; break;
    		case 'C' : MARCH[3]++; break;
    		case 'H' : MARCH[4]++; break;
    		default : break;
    		}
    	}
    	sc.close();
    	for(int i = 0; i < 3; i++){
    		for(int j = i+1; j < 4; j++){
    			for(int k = j+1; k < 5; k++){
    				ans += MARCH[i] * MARCH[j] * MARCH[k];
    			}
    		}
    	}
    	System.out.println(ans);
    }

}
