public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int H = 0;
        int W = 0;
        String w = "";
        String h = "";
        int judge = 0;
        while(judge == 0){
            H = scan.nextInt();
            W = scan.nextInt();
            if(judge == 0){
                w = "";
                h = "";
            }
            if(H == 0 && W == 0){
                judge = 1;
            }else{
                for(int i = 0;i <= W - 1;i++){    
                   w = w + "#";
                   if(i == 0 || i == W - 1){
                       h = h + "#";
                   }else{
                       h = h + ".";
                   }
                }
                for(int I = 0;I <= H - 1;I++){
                   if(I == 0){
                       System.out.println(w);
                   }else if(I > 0 && I < H - 1){
                       System.out.println(h);
                   }else if(I == H - 1){
                       System.out.println(w + "\r\n");
                   }
                }
            }
        }
    }
}
