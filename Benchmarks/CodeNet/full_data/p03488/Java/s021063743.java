import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int cx = 0;
            int cy = 0;
            Boolean rslt = Move(s, x, y, cx, cy, 1, 0);
            if (rslt) System.out.println("Yes");
            else System.out.println("No");
        };
              
        private static Boolean Move(String s, int x, int y, int cx, int cy, int dx, int dy ){
            int len = s.length();
            if (len < 1){
                if ((x==cx) && (y==cy)){
                    return true;
                } else {
                    return false;
                }
            }
            char op=s.charAt(0);
            Boolean rslt = true;
            if (op == 'F'){
                rslt = Move(s.substring(1,len), x, y, cx+dx, cy+dy, dx, dy);
            } else {
                if (op == 'T'){
                    if ((dx==1)&&(dy==0)){
                        rslt = Move(s.substring(1,len), x, y, cx, cy, 0, 1);
                    } else if ((dx==0)&&(dy==1)){
                        rslt = Move(s.substring(1,len), x, y, cx, cy, -1, 0);
                    } else if ((dx==-1)&&(dy==0)){
                        rslt = Move(s.substring(1,len), x, y, cx, cy, 0, -1);
                    } else if ((dx==0)&&(dy==-1)){
                        rslt = Move(s.substring(1,len), x, y, cx, cy, 1, 0);
                    }
                    if (!rslt){
                        if ((dx==1)&&(dy==0)){
                            rslt = Move(s.substring(1,len), x, y, cx, cy, 0, -1);
                        } else if ((dx==0)&&(dy==-1)){
                            rslt = Move(s.substring(1,len), x, y, cx, cy, -1, 0);
                        } else if ((dx==-1)&&(dy==0)){
                            rslt = Move(s.substring(1,len), x, y, cx, cy, 0, 1);
                        } else if ((dx==0)&&(dy==1)){
                            rslt = Move(s.substring(1,len), x, y, cx, cy, 1, 0);
                        }
                    }
                } else {
                    System.out.println("Operation Error");
                    rslt = false;
                }
            }
            return rslt;
        }
}