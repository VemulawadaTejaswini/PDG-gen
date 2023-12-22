import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        Character[][] cake = new Character[h][w];
        for(int i=0; i<h; i++){
            String s = sc.next();
            int j = 0;
            for(char c : s.toCharArray()){
                cake[i][j] = c;
                j++;
            }
        }
        int count = 1;
        boolean first = true;
        boolean alternate = false;
        int[][] ans = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w && !alternate; j++){
                if(cake[i][j] == '#'){
                    if(!first)
                        count++;
                    else    
                        first = false;
                }
                ans[i][j] = count;
            }
            for(int j=w-1; j>=0 && alternate; j--){
                if(cake[i][j] == '#'){
                    if(!first)
                        count++;
                    else    
                        first = false;
                }
                ans[i][j] = count;
            }
            alternate = !alternate;
            System.out.println();
        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(ans[i][j]+" ");
            }System.out.println();
        }
        sc.close();
    }
}