

    public class Index{
      		public static void main (Stirng[] args){
               INT A,B,C;
             /* BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
     			A = new String(in.readLine() );
                */
              
              while(1){
                	   BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
     					A = new String(in.readLine() );
                if(A == 5 && A==7){
                		B = new String(in.readLine() );
                	if(B == 5 && B==7){
                      	if(A==B==7){
                          A=0; B=0;
                          System.out.println("NO!");
                          break;
                        }
                         C = new String(in.readLine());
                      	if(A + B + C == 17){
                          	System.outprintln("Yes!");
                        }
                      	else{
                          break;
                        }
                    }
                }
              }
 }
 }
 }