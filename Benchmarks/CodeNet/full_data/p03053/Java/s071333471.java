import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int sharp_cnt = 0;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        char map[][] = new char[h][w];
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j = 0; j<w; j++){
                if(s.charAt(j)=='#') sharp_cnt++;
            }
            map[i] = s.toCharArray();
        }
        int sharp_all = sharp_cnt;
        int nokori = h*w;
        int cnt = 0;
        while(true){
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j] == '#'){
                        for(int k=0; k<4; k++){
                            if(j+dx[k]>=0 && j+dx[k]<w && i+dy[k]>=0 && i+dy[k]<h){
                                if(map[j+dx[k]][i+dy[k]]=='.') map[j+dx[k]][i+dy[k]] = '#'; sharp_all++;
                            }
                        }
                    }
                }
            }
            cnt++;
            if(nokori-sharp_all == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}