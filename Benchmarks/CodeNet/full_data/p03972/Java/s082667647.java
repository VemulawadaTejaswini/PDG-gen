import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int min(int x, int y){
		if(x<y) return x;
		else return y;
	}
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int W = Integer.parseInt(line[0]);
        int H = Integer.parseInt(line[1]);
        int[] hor = new int[W];
        int[] ver = new int[H];
        for(int w=0;w<W;w++) hor[w] = Integer.parseInt(br.readLine());
        for(int h=0;h<H;h++) ver[h] = Integer.parseInt(br.readLine());
        
        int cost = 0;
        for(int h=0;h<H;h++) cost+= ver[h];
        for(int w=0;w<W;w++){
        	cost += hor[w];
        	for(int h=0;h<H;h++) cost += min(hor[w],ver[h]);
        }
        
        System.out.println(cost);
    }
}