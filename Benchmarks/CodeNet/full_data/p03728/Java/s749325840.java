import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int i = scan.nextInt();
	int p[] = new int[i];
	int p1[] = new int[i];
	int cnt=0;

	for(int j=0; j<i; j++){
	    p[j]= scan.nextInt();
	}
	for(int j=0; j<i; j++){
	    p1[j]= j+1;
	}
	int flag=0;
	    int count=0;
	    for(int j=0; j<i; j++){
		if(p[j]==(j+1)) count++;
	    }
	    if(count==i) flag=1;
	while(flag==0){
	    cnt++;
	    
	    int a[] = new int[i];
	    int b[] = new int[i];
	    int j1=0;
	    int j2=0;
	    int max=0;
	    
	    for(int j=0; j<i; j++){
		if(p[j] >= max){
		    a[j1]=p[j];
		    max=p[j];
		    j1++;
		}else{
		    b[j2]=p[j];
		    j2++;
		}
	    }
	    System.arraycopy(b,0,p,0,j2);
	    System.arraycopy(a,0,p,j2,j1);
	    if(Arrays.equals(p,p1)) flag=1;
	}
    System.out.println(cnt);
    }
}
