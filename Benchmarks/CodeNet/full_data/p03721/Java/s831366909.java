import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = 0;
        int ans = 0;
		int [] in1 = new int [a];
        int [] in2 = new int [a];
        int [] in3 = new int [a];
        
        for(int i=0;i<a;i++){in1[i] = sc.nextInt();
                             in2[i] = sc.nextInt();
                             in3[i] = in1[i];
                            }
		Arrays.sort(in1);       		
        while(ans==0){for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){if(in1[i] == in3[j]){c+=in2[j];}
                             if(c>=b){ans=in1[i];break;}
                            }                                      
                            }
                     }
		System.out.println(ans);
	}
}
