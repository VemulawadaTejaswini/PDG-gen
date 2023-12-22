import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        int A = Integer.parseInt(SC.next());
        int B = Integer.parseInt(SC.next());

        int left  = -1;
        int right = 1500;
        while(right-left>1){
            int mid = left + (right - left)/2;
            int tax = (int)( ((double)mid) * 0.08);

            if(tax >= A){
                right = mid;
            } else {
                left = mid;
            }
        }

        while(true){
            int tax = (int)(((double)right)*0.1);
            if(B == tax){
                System.out.println(right);
                return;
            }
            tax = (int)(((double)right)*0.08);
            if(tax != A){
                System.out.println("-1");
                return;
            }
            right++;
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
