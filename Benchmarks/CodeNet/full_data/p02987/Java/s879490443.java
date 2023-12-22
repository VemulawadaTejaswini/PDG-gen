import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            int[] Count = new int[2];
            boolean[] judge = new boolean[4];
            Count[0] = 1;
            Count[1] = 1;

            char[] ch = new char[4];

            for(int i=0; i<4; i++){
                ch[i] = str.charAt(i);
                judge[i] = false;
            }

            int k = 0;
            for(int i=0; i<4; i++){
                if(judge[i] == false){
                    judge[i] = true;
                    for(int j=i; j<3; j++){
                        if(judge[j+1] == false && ch[j+1] == ch[i]){
                            judge[j+1] = true;
                            Count[k]++;
                        }
                    }
                    k++;
                }
            }

            boolean ju = true;
            for(int i=0; i<2; i++){
                if(Count[i] != 2){
                    ju = false;
                }
            }

            if(ju == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

    }
}