import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		double [] in = new double [a];
        for(int i=0;i<a;i++){
                             in[i] = (sc.nextInt()+1)*0.5;
                            }
		double [] in2 = new double [a-b+1];
        for(int i=0;i<a-b+1;i++){if(i==0){for(int j=0;j<b;j++){in2[i]+=in[j];}
                                         }else{in2[i]=in2[i-1]+in[b+i-1]-in[i-1];
                                             }                                                 
                                }
        Arrays.sort(in2);
		System.out.println(in2[a-b]);
	}
}