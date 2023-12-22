import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  	double[] a=new double[n];
  	for(int c=0;c<n;c++){
  	a[c]=sc.nextDouble();
    }
    double b=0;
  	for(int c=0;c<n;c++){
    b+=1/a[c];
    }
    System.out.println(1/b);
    }
}