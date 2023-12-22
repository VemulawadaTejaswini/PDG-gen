import java.io.*;

class A132{
    public static void main(String args[]){
        int count = 0;
        char a[] = new char[5];
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            String str = br.readLine();
            for(int i = 0;i < str.length();i++){
                a[i] = str.charAt(i);
            }
            if(a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3]){
                
            }else if(a[0]==a[1]&&a[2]==a[3]){
            count++;
            }else if(a[0]==a[2]&&a[1]==a[3]){
                count++;
            }else if(a[0]==a[3]&&a[1]==a[2]){
                count++;
            }
            if(count == 1){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }catch(IOException e){
        }
    }
}