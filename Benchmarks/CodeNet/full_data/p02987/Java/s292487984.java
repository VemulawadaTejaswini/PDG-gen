import java.io.*;

class A132{
    public static void main(String args[]){
        char a[] = new char[5];
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            String str = br.readLine();
            for(int i = 0;i < 4;i++){
                a[i] = str.charAt(i);
            }
            if(a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3]){
                System.out.println("No");
            }else if(a[0]==a[1]&&a[2]==a[3]||a[0]==a[2]&&a[1]==a[3]||a[0]==a[3]&&a[1]==a[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }catch(IOException e){
        }
    }
}