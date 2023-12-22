public class Main{
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n=scan.nextInt();
	        float array[]=new float[2*n-1];
	        for(int i=0;i<n;i++){
	        	array[i]=scan.nextInt();
	        }
	        for(int i=0;i<n-1;i++){
	            Arrays.sort(array);
	            array[i]=(array[2*n-2]+array[2*n-3])/2;
	            array[2*n-2]=0;
	            array[2*n-3]=0;
	        }
	        System.out.print(array[n-2]);
	    }
	}