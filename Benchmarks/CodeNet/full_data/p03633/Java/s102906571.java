import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        String [] str = new String [a];
        boolean b = false;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
        Arrays.sort(ln);
		long ans = 0;
        while(b = false){ans+=ln[a-1];
        for(int i=0;i<a;i++){if(ans%ln[i]==0){if(i==b-1){b = true;}
                                             }else{break;}
                            }                             
                        }       
		System.out.println(ans);
	}
}
