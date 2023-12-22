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
        Arrays.sort(in);
		long ans = 0;
        while(b = false){ans+=in[a-1];
        for(int i=0;i<a;i++){if(ans%in[i]==0){if(i==a-1){b = true;}
                                             }else{break;}
                            }                             
                        }       
		System.out.println(ans);
	}
}
