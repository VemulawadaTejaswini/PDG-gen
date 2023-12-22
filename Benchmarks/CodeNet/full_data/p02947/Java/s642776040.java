import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[][] cnt=new int[n][26];
        for(int i=0;i<n;i++){
            Arrays.fill(cnt[i],0);
            String ar=scn.next();
            for(int j=0;j<10;j++){
               cnt[i][ar.charAt(j)-'a']++;
            }
        } 
        scn.close();
        int answer = 0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                int check=0;
                for(int k=0;k<26;k++){
                    if(cnt[i][k]!=cnt[j][k]){
                        check++;
                        break;
                    }
                }
                if(check==0) answer++;
            }
        }
        System.out.println(answer);
    }
}
