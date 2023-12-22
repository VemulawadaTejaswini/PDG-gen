import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];
	int[] d = new int[N];

	for(int i = 0; i < N; i++){
	    a[i] = scan.nextInt();
	    b[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    c[i] = scan.nextInt();
	    d[i] = scan.nextInt();
	}

	a = sort(a,N);
	b = sort(b,N);
	c = sort(c,N);
	d = sort(d,N);

	int count = 0;
	for(int i = 0; i < N; i++){
	    if(a[i] < c[i]){
		if(b[i] < d[i]){
		    count++;
		}
	    }
	}
	
	System.out.println(count);
    }
	

    private static int[] sort(int[] array, int N){
	for(int i = 0; i < N-1; i++){
	    for(int j = i+1; j < N; j++){
		if(array[i] > array[j]){
		    int tmp = array[i];
		    array[i] = array[j];
		    array[j] = tmp;
		}
	    }
	}

	return array;
    }
}
