import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N = Integer.parseInt(scan.next());
	int a[] = new int[N];
	for(int i=0;i<N;i++){
	    a[i]= Integer.parseInt(scan.next());
	}
	int p=0;
	for(int i=0;i<N;i++){
	    int j=0;
	    j=a[i];
	    if((i+1)==a[j-1])
		p++;
	}
	p = p/2;
	System.out.println(p);
    }
}