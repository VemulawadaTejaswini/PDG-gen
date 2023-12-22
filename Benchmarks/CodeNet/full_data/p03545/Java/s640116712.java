import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buf=sc.next();
		int[] a=new int[4];
		for(int i=0;i<4;i++){
			a[i]=Integer.parseInt(buf.substring(i, i+1));
		}
		
		for(int i=0;i<8;i++){
			int ans=a[0];
			String anss=Integer.toString(a[0]);
			for(int j=0;j<3;j++){
				if(((int)Math.pow(2, j)&i)!=0){
					ans+=a[j+1];
					anss+="+"+Integer.toString(a[j+1]);
				}else{
					ans-=a[j+1];
					anss+="-"+Integer.toString(a[j+1]);
				}
			}
			if(ans==7){
				System.out.println(anss+"=7");
				return;
			}
		}
		
	}
}