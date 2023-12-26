public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
     	int n = scan.nextInt();
      	int m = scan.nextInt();
      	int x = scan.nextInt();
      	int[] A = new int[m];
      	int smallcounter = 0;
      	int bigcounter = 0;
      	for(int i = 0; i < m; i++){
        	A[i] = scan.nextInt();
          	if(A[i] < x){
            	smallcounter++;
            }
          	else{
            	bigcounter++;
            }
        }
      	if(smallcounter < bigcounter){
        	System.out.print(smallcounter);
        }
      	else{
        	System.out.print(bigcounter);
        }
    }
}
