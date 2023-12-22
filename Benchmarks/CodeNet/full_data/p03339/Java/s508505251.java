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
                
                for(int i = 1; i < N; i++) {
                	if(we[i].equals("E")) {
                		count ++;
                	}
                }
                int min = count;
                for(int j = 1; j < N; j++) {
            		if( we[j-1].equals("W")) {
                		count++;
                	}
            		if( we[j].equals("E")) {
                		count--;
                	}
            		min = Math.min(min, count);	
                }
            	
               System.out.println(min);
            }
        }