public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int min, mid, max;
        if (a < b){
            if (a < c){
                min = a;
                if (b < c){
                    mid = b;
                    max = c;
                }
                else {
                    mid = c;
                    max = b;
                }
            }
            else {
                min = c;
                mid = a;
                max = b;
            }
        }
        else{
            if (b < c){
                min = b;
                if(a > c){
                    mid = c;
                    max = a;
                }
                else{
                    mid = a;
                    max = c;
                }
            }
            else{
                min = c;
                mid = b;
                max = a;
            }
        }
    System.out.println(min+" "+mid+" "+max);
    }
}
