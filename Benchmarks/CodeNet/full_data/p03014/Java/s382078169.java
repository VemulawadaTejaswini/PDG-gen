import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[] s = new String[h];
        for(int i = 0; i < h; i++){
            s[i] = sc.next();
        }
        
        int[] sx = new int[h*w];
        int count;
        int index;
        for(int y = 0; y < h; y++){
            count = 1;
            for(int x = 0; x < w; x++){
                index = w*y +x;
                if(s[y].charAt(x) == '.'){
                    sx[index] = count;
                    count++;
                }else{
                    count = 1;
                }
            }
        }
        for(int y = 0; y < h; y++){
            for(int x = w-1; x >=0; x--){
                index = w*y +x;
                if(sx[index] != 0){
                    for(int i = 1; i < sx[index]; i++){
                        sx[index -i] = sx[index];
                    }
                    x -= sx[index];
                }
            }
        }
        
        int[] sy = new int[h*w];
        for(int x = 0; x < w; x++){
            count = 1;
            for(int y = 0; y < h; y++){
                index = w*y +x;
                if(sx[index] != 0){
                    sy[index] = count;
                    count++;
                }else{
                    count = 1;
                }
            }
        }
        for(int x = 0; x < w; x++){
            for(int y = h-1; y >= 0; y--){
                index = w*y +x;
                if(sy[index] != 0){
                    for(int i = 1; i < sy[index]; i++){
                        sy[index -w*i] = sy[index];
                    }
                    y -= sy[index];
                }
            }
        }
        
        int max = 0;
        int light;
        for(int i = 0; i < h*w; i++){
            light = sx[i] + sy[i];
            if(light > max){
                max = light;
            }
        }
        
        System.out.println(max -1);
    }
}