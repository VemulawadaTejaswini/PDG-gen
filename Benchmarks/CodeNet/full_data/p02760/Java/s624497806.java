import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int[] ary1 = new int[3];
    	int[] ary2 = new int[3];
    	int[] ary3 = new int[3];
    	for(int i = 0; i < 3; i++){
    		ary1[i] = sc.nextInt();
    	}
    	for(int i = 0; i < 3; i++){
    		ary2[i] = sc.nextInt();
    	}
    	for(int i = 0; i < 3; i++){
    		ary3[i] = sc.nextInt();
    	}
    	int n = sc.nextInt();
    	for(int i = 0; i < n; i++){
    		int b = sc.nextInt();
    		for(int j = 0; j < 3; j++){
        		if(ary1[j] == b){
        			ary1[j] = 0;
        		}
        		if(ary2[j] == b){
        			ary2[j] = 0;
        		}
        		if(ary3[j] == b){
        			ary3[j] = 0;
        		}
        	}
    	}
    	sc.close();
    	if(ary1[0] == 0 && ary1[1] == 0 && ary1[2] == 0){
    		System.out.println("Yes");
    	}else if(ary2[0] == 0 && ary2[1] == 0 && ary2[2] == 0){
    		System.out.println("Yes");
    	}else if(ary3[0] == 0 && ary3[1] == 0 && ary3[2] == 0){
    		System.out.println("Yes");
    	}else if(ary1[0] == 0 && ary2[1] == 0 && ary3[2] == 0){
    		System.out.println("Yes");
    	}else if(ary1[2] == 0 && ary2[1] == 0 && ary3[0] == 0){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
    }
}