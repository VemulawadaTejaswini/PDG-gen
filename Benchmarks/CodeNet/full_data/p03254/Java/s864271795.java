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
            for (int var : happy_no) {
                if((x-var)>0){
                    tot_happy++;
                    x-=var;
                }
                else if(x==var){
                    // tot_happy++;
                    x=0;
                    break;
                }
                else 
                {break;}
            }
                System.out.print(Math.min(tot_happy,n));
            
        }
    }