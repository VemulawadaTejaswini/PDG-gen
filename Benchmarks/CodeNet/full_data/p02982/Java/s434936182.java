import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int d = sc.nextInt();
		int [][] in = new int [n][d];
        for(int i=0;i<n;i++){
        for(int j=0;j<d;j++){
                             in[i][j] = sc.nextInt();
                            }
                            }
        int b = 0;
        int c = 0;
        for(int i=0;i<n-1;i++){
          for(int j=i+1;j<n;j++){c=0;
          for(int k=0;k<d;k++){c+=(in[i][k]-in[j][k])*(in[i][k]-in[j][k]);}
                                for(int l=0;l<=Math.sqrt(c);l++){if(l*l==c){b++;}
                                                                }                                       
                                }                            
        }      
		System.out.println(b);
	}
}
