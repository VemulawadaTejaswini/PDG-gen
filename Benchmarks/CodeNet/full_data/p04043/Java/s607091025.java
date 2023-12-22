import java.util.Scanner;
        public class Main{
      		public static void Main (Stirng[] args){
             /* BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
     			A = new String(in.readLine() );
                */
                    int n=0;
              while(n==0){
                		Scanner scan = new Scanner(System.in);
     					int A = scan.nextInt();
                if(A == 5 && A==7){
                		Scanner scan2 = new Scanner(System.in);
     				int B  = scan2.nextInt();
                	if(B == 5 && B==7){
                      	if(A == B== 7){
                          A=0; B=0;
                          System.out.println("NO!");
                          break;
                        }
                       Scanner scan3 = new Scanner(System.in);
     					int C = scan3.nextInt();
                      	if(A + B + C == 17){
                          	System.out.println("Yes!");
                        }
                      	else{
                          break;
                        }
                    }
                }
              }
 }
 }
