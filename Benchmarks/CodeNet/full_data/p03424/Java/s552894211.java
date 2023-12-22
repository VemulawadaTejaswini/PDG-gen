import java.util.Scanner;


public class Main {
	
	static int[][] memory;
	
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
   
        int count = 0;
        boolean[] color = {false,false,false,false};
        
        for(int i = 0;i<N;i++){
        	
        	String line = sc.next();
        	
        	if('P'==line.charAt(0)&&!color[0]){
        		color[0] = true;
        		count++;
        	}else if('W'==line.charAt(0)&&!color[1]){
        		color[1] = true;
        		count++;
        	}else if('G'==line.charAt(0)&&!color[2]){
        		color[2] = true;
        		count++;
        	}else if('Y'==line.charAt(0)&&!color[3]){
        		color[3] = true;
        		count++;
        	}
        	
        	if(count==4) break;
        	
        }
        if(color[3])
        	System.out.println("Four");
        else
        	System.out.println("Three");
	}
		

    
}