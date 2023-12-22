import java.util.*;

class Main {

    public static int pivot(int[] a,int i,int j){
	int k=i+1;
	while(k<=j && a[i]==a[k])
	    k++;
	if(k>j)
	    return -1;
	if(a[i]>=a[k])
	    return i;
	return k;
    }

    public static int partition(int[] a,int b[],int i,int j,int x) {
	int l=i,r=j;

	while(l<=r){
	    while(l<=j && a[l]<x)
		l++;
	    while(r>=i && a[r]>=x)
		r--;
	    if(l>r)
		break;
	    int t=a[l];
	    a[l]=a[r];
	    a[r]=t;
	    int s=b[l];
	    b[l]=b[r];
	    b[r]=s;
	    l++;
	    r--;
	}
	return l;
    }

    public static void quickSort(int[] a,int[] b,int i,int j){
	if(i==j)
	    return;
	int p=pivot(a,i,j);
	if(p!=-1){
	    int k=partition(a,b,i,j,a[p]);
	    quickSort(a,b,i,k-1);
	    quickSort(a,b,k,j);
	}
    }
    
    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int A[] = new int[N];
	int B[] = new int[N];
	for (int i = 0; i < N; i++) {
	    A[i] = sc.nextInt();
	    B[i] = i + 1 ;
	}

	quickSort(A,B,0,N - 1);

	for (int i = 0; i < N; i++)
	    System.out.print(B[i] + " ");

	System.out.println();
    }
}