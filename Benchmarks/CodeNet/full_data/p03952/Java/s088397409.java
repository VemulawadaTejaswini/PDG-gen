import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
    	int x=sc.nextInt();
    	boolean flg=true;
    	if(x==1 || x==2*N-1) flg=false;
    	int[] outputArray = new int[2*N-1];
    	System.out.println(flg?"Yes":"No");
    	if(flg) {
    		if(N==2) {
    			outputArray[0]=1;
    			outputArray[1]=2;
    			outputArray[2]=3;
    		}
    		else {
    			for(int i=0; i<outputArray.length; i++) {
    				outputArray[i]=i+1;
    			}
    			if(x==2) {
            		swap(outputArray,N-1,2*N-1);
            		swap(outputArray,N,x);
            		swap(outputArray,N+1,1);
            	}else{
            		swap(outputArray,N-2,2);
            		swap(outputArray,N-1,2*N-1);
            		if(x==N-2){
            			swap(outputArray,N,2);
            		}else if(x==N-1){
            			swap(outputArray,N,2*N-1);
            		}else {
            			swap(outputArray,N,x);
            		}
            		swap(outputArray,N+1,1);
            	}
    		}
    		output(outputArray);
    	}

    }
    private void output(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
    }
    private void swap(int[] array, int index1, int index2) {
    	if(index1!=index2) {
	    	int tmp = array[index1-1];
	    	array[index1-1]=array[index2-1];
	    	array[index2-1]=tmp;
    	}
    }
}