import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        String c[] = new String[a];
        String cc[][] = new String[a][b];
        int tate[] = new int[a];
        int yoko[] = new int[b];
        Arrays.fill(tate,0);
        Arrays.fill(yoko,0);
        int i,j;
      	for(i = 0;i < a;i++){
          c[i] = sc.next();
          cc[i] = c[i].split("");
        }
        for(i = 0;i < a;i++){
          for(j = 0;j < b;j++){
            if(cc[i][j].equals("#")){
            tate[i] = 1;
            yoko[j] = 1;
            }
          }
        }
      	for(i = 0;i < a;i++){
          if(tate[i] == 1){
          	for(j = 0;j < b;j++){
            	if(yoko[j] == 1){
             		 System.out.print(cc[i][j]);
           		}
          	}
          System.out.println("");            
          }
        }
    }
}