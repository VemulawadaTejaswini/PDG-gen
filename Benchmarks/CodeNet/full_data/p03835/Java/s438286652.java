import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int a = as.nextInt();
		int b = as.nextInt();
		int c;
		int l =0;
		if(a<b){
			for(int i=0;i<=a;i++){
				c=b;
				c-=i;
				for(int s=0;s<=a;s++){
					c-=s;
					if(c<0){
						break;
					}else {
						if(c>a){
							c+=s;
							continue;
						}else if(s==c){
							l++;
							c+=s;
						}else{
							l+=2;
							c+=s;
						}
					}
				}
			}
		}else{
			l+=(b+2)*(b+1)/2;
		}
		System.out.println(l);
	}
}
