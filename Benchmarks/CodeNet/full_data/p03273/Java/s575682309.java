import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
        int w = sc.nextInt();
        char c[][] = new char[h][w];
        for(int i = 0; i < h; i++){
        	String s = sc.next();
            for(int j = 0; j < w; j++){
            	c[i][j] = s.charAt(j);
            }
        }
        int a[] = new int[h];
        int x = 0;
        for(int i = 0; i < h; i++){
        	int count = 0;
            for(int j = 0; j < w; j++){
            	if(c[i][j] == '.'){
                	count++;
                }
            }
            if(count != w){
            	a[x] = i;
                x++;
            }
        }
        int b[] = new int[w];
        int y = 0;
        for(int i = 0; i < w; i++){
        	int count = 0;
            for(int j = 0; j < h; j++){
            	if(c[j][i] == '.'){
                	count++;
                }
            }
            if(count != w){
            	b[y] = i;
                y++;
            }
        }
        for(int i = 0; i < x; i++){
        	for(int j = 0; j < y; j++){
            	if(j == y - 1){
                	System.out.println(c[a[i]][b[j]]);
                }else{
                	System.out.print(c[a[i]][b[j]]);
                }
            }
        }
    }
}