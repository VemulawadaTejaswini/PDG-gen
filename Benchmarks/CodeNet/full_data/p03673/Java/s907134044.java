import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
	//	int c = sc.nextInt();
		// 文字列の入力
	//	String s = sc.next();
		// 出力
	//	System.out.println((a+b+c) + " " + s);
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
	    int[] b=new int[n];
	    int tmp=0;
	    for(int i=0;i<n;i++){
	        b[i]=a[i];
	        int j=0;
	        do{
	            tmp=b[i-j];
	            b[i-j]=b[j];
	            b[j]=tmp;
	            j++;
	        }while(j<=i/2);
	       }
	       for(int i=0;i<n;i++)
	       System.out.print(b[i]+" ");
	   
	}
}
