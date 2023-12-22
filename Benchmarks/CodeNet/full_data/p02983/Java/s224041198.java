import java.io.*;
class a{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb1 = br.readLine();
        String[] a = sb1.split(" ");
        int[] c = new int[a.length];
        int[] b = new int[a.length];
        for(int i = 0;i < a.length;i++){
            c[i] = Integer.parseInt(a[i]);
        }
        for(int i = 0;i < a.length;i++){
            b[i] = c[i]/2019;
        }
        
        if(c[1] < 2019){
            System.out.println(c[0] * (c[0] + 1));
        } else if(b[0] == b[1]){
            System.out.println(c[0]%2019 * (c[0] + 1)%2019);
        }  else {
            System.out.println(0);
        }
        
    }
}