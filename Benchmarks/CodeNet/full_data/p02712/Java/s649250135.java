        import java.util.*;
        import java.io.*;
         
        public class Main {
            public static void main(String[] args) throws IOException{
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int sum = 0;
              	for(int i = 1 ; i <= n ; i++){
                	if(i % 3 != 0 && i % 5 != 0){
                		sum += i;
                	}
                }
              	System.out.println();
                scan.close();
            }
        }