import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = 1;
        for(int i=1;i<=a;i++){b*=i;
                             }
        String [] str = new String [10];
        str[0] = "a"; str[1] = "b"; str[2] = "c"; str[3] = "d"; str[4] = "e"; 
        str[5] = "f"; str[6] = "g"; str[7] = "h"; str[8] = "i"; str[9] = "j"; 
        String [] str2 = new String [b];
        for(int i=0;i<b;i++){str2[i] = " ";}
        for(int i=0;i<b;i++){int c = 0;
        for(int j=0;j<a;j++){str2[i]+=str[c];}                    
                            }
        for(int i=0;i<b;i++){System.out.println(str2[i]);
                            }		
	}
}