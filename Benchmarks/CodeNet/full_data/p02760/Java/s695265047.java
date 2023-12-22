    import java.util.*;
     
    class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
     
            int a[][] = new int[3][3];
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            
            int N = sc.nextInt();
            int b[] = new int[N];
            for(int i=0; i<N; i++) {
                b[i] = sc.nextInt();
            }
     
            boolean bingo = false;
            int cnt = 0;
     
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    for(int k=0; k<N; k++) {
                        if(a[i][j] == b[k]) { 
                        cnt++;
                        break;
                        }
                    }
                }
                if(cnt == 3) bingo = true;
                cnt = 0;
            }
     
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    for(int k=0; k<N; k++) {
                        if(a[j][i] == b[k]) {
                        cnt ++;
                        break;
                        }
                    }
                }
                if(cnt == 3) bingo = true;
                cnt = 0;
            }
     
            for(int i=0,j=0; i<3; i++,j++) {
                for(int k=0; k<N; k++) {
                    if(a[i][j] == b[k]) cnt++;
                    break;
                }
                if(cnt == 3) bingo = true;
            }
            cnt = 0;
     
            for(int i=2,j=2; i>=0; i--,j--) {
                for(int k=0; k<N; k++) {
                    if(a[i][j] == b[k]) cnt++;
                    break;
                }
                if(cnt == 3) bingo = true;
            }
     
            if(bingo) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
     
    }