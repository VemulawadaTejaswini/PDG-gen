    import java.util.Scanner;
    
    class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            sc.close();
            String[] we = S.split("");
            int count = 0;
            int min = N;
            
            for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) {
                	if( i == j) {
                		continue;
                	}
                	if(i < j) {
                		if( we[j].equals("E")) {
                    		count++;
                    	}
                	}else {
                		if( we[j].equals("W")) {
                    		count++;
                    	}
                	}
                }
            	if(count<min) {
            		min = count;
            	}
        		count = 0;
            }
           System.out.println(min);
        }
    }