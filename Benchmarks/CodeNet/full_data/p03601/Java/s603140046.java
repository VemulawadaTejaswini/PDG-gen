import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		
		float max;
		int maxw, maxs;
		max = -10.0f;
		maxw = 0;
		maxs = 0;
		
		for(int i=0; i*a*100<=f; i++){
			for(int j=0; i*a*100 + j*b*100<=f; j++){
				for(int k=0; i*a*100 + j*b*100 + k*c<=f; k++){
					for(int l=0; i*a*100 + j*b*100 + k*c + l*d<=f; l++){
						if((i*a+j*b)*e >= k*c+l*d){
							if(i+j == 0){
								break;
							}
							if((float)(100*(k*c+l*d)) / (float)(100*i*a+100*j*b+k*c+l*d) > max){
								max = (float)(100*(k*c+l*d)) / (float)(100*i*a+100*j*b+k*c+l*d);
								maxw = 100*i*a + 100*j*b;
								maxs = k*c + l*d;
							}
						}
					}
				}
			}
		}
		
		System.out.println((maxw+maxs) + " " + maxs);
	}
}
