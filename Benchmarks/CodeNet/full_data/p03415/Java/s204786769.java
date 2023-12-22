import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s[] = new String[3];
        char c[][] = new char[3][3];
        for(int i=0;i<3;i++){
          s[i] = sc.next();
        }
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            c[i][j] = s[i].charAt(j);
          }
        }
        for(int i=0;i<3;i++){
          s[i] = String.valueOf(c[i][i]);
        }
      
        System.out.println(s[0]+s[1]+s[2]);  
	}
}