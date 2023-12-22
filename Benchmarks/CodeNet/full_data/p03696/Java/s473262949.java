import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str=scan.next();
        int[] flag=new int[n];
        int does=0;
        for(int i=0;i<n;i++){
            if((str.substring(i,i+1)).equals("(")) {
                flag[i]=1;
                does++;
            }
            else {
                flag[i]=2;
                if(does>0){
                    for(int j=i-1;0<=j;j--){
                        if(flag[j]==1){
                            flag[j]=0;
                            flag[i]=0;
                            does--;
                            break;
                        }
                    }
                }
            }
        }

        //for(int i=0;i<n;i++) System.out.printf("%d ",flag[i]);
        //System.out.println();

        for(int i=0;i<n;i++){
            if(flag[i]==2) str="("+str;
            else if(flag[i]==1) str=str+")";
        }

        System.out.println(str);
    }
}