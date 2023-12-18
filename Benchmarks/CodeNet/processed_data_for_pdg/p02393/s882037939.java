public class Main {
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int min=0;
        int max=0;
        int mid=0;
        if(a <= b){
            if(a<=c){
                min=a;
                if(c<=b){
                    max=b; 
                    mid=c;
                }else{
                    max=c; 
                    mid=b;
                }
            }else{
                min=c;
                mid=a;
                max=b;
            }
        }else if(a>b){
            if(b<=c){
                min=b;
                if(c<=a){
                    max=a; 
                    mid=c;
                }else{
                    max=c; 
                    mid=a;
                }
            }else{
                min=c;
                mid=b;
                max=a;
            }
        }
        System.out.println(min +" "+ mid +" "+ max);
        scan.close();
        return;
    }
}
