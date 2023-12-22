    import java.util.Arrays;
    import java.util.Scanner;

    class Main{
        public static void main(String[] args) {
            Scanner sb = new Scanner(System.in);
            int tot_happy = 0;
            int n = sb.nextInt();
            int x = sb.nextInt();
            int happy_no[] = new int[n]; 
            for (int i = 0; i < n; i++) {
                happy_no[i] = sb.nextInt();
                }
            Arrays.sort(happy_no);
            int i=-1;
            for (int var : happy_no) {
                if((x-var)>=0){
                    tot_happy++;
                    x-=var;
                }
                else
                break;
            }
                System.out.print(tot_happy);
            
        }
    }