import java.util.*;;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] s = new String[H];

        for(int i=0; i<H; i++){
            s[i] = sc.next();
        }

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                int[] a = new int[4];
                a[0] = i + 1;
                a[1] = i - 1;
                a[2] = j + 1;
                a[3] = j - 1; 
                if(s[i].charAt(j)=='#'){
                    for(int k=0; k<4; k++){
                        if(k==0 || k==1){
                            if(a[k]>=0 && a[k]<H){
                                if(s[a[k]].charAt(j)=='#'){
                                    break;
                                }
                            }
                        }
                        else{
                            if(a[k]>=0 && a[k]<W){
                                if(s[i].charAt(a[k])=='#'){
                                    break;
                                }
                            }
                        }
                        if(k==3){
                            System.out.println("No");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}