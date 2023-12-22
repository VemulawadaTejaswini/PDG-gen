import java.io.*;
class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb1 = br.readLine();
        String sb2 = br.readLine();
        String[] l = sb2.split(" ");
        int[] a = new int[l.length + 1];
        int[] z = new int[a.length];
        int count = 0;
        int r = 0;
        for(int i = 1;i < a.length;i++){
            a[i] = Integer.parseInt(l[i - 1]);
        }
        for(int i = 1;i < a.length;i++){           
            if(a[i] == 1){   
                count++;
            }
            if(i > 1){
                int count2 = 0;
                //System.out.println(i + "の倍数");
                for(int b = i;b < a.length;b = b + i){
                    //System.out.println(b);
                    //System.out.println(a[b]);
                    if(a[b] == 1){   
                        count2++;
                        //System.out.println("hayami");
                    }
                }
                if((count2 % 2) == 1){
                    z[i] = 1;
                    r++;
                }
            }
        }
        if((count % 2) == 1){
            z[1] = 1;
            r++;
        }
        //System.out.println();
        System.out.println(r);
        for(int i = 1;i < z.length;i++){
            if(z[i] == 1){
                System.out.print(i + " ");
            }
        }

    }
}