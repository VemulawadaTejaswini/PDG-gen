public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int k = sc.nextInt();
	int count =0;
	int res=0;
	if(k>0){
	    if(a>k){
	        res+=k;
	    }else{
	        res+=a;
	        k-=a;
	    }
	}
	if(k>0){
	    k-=b;
	}
	if(k>0){
	    if(c>k){
	        res-=k;
	    }else{
	        res-=c;
	    }
	}
	System.out.println(res);
	}
}
