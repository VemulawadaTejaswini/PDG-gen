import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	
		int N = sc.nextInt();
      	int lines[] =new int[N];
      	for(int i=0;i<N;i++){
        	lines[i]=sc.nextInt();
        }
      	Arrays.sort(lines);
      	int cnt =0;
      	for(int i=0;i<N-1;i++){
        	cnt+= lines[i];
        }
      	if(cnt>lines[N-1]){
        	System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
}