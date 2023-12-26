public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt(); 
      	int T = scan.nextInt(); 
      	int A = scan.nextInt(); 
      	int[] H = new int[n]; 
      	for (int i = 0; i < n; i++){
        	H[i] = scan.nextInt();
        }
      	double[] t = new double[n]; 
      	for (int i = 0; i < n; i++){
        	t[i] = T - 0.006 * H[i];
        }
      	double rest = Math.abs(t[0]-A);
      	int key = 0;
      	for (int i = 0; i < n; i++){
        	if(rest > Math.abs(t[i]-A)){
            	rest = Math.abs(t[i]-A);
              	key = i;
            }
        }
      	System.out.print(key + 1);
    }
}
