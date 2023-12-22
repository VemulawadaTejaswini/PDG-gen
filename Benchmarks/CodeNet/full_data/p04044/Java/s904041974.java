import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        String s = sc.next();
//        Long x = sc.nextLong();
        String masterList[] = new String[n];
        String list[] = new String[n+1];
        int order[] = new int[n+1];

        for(int i=0;i<n;i++){
            masterList[i] = sc.next();
            list[i]=masterList[i];
            order[i]= i;
        }

        for(int i=1;i<=n;i++){
            for(int j=i-1;j>0;j--){
                for(int t=0;t<l;t++){
                    if(list[j-1].toCharArray()[t]==list[j].toCharArray()[t]){
                        continue;
                    }
                    if(list[j-1].toCharArray()[t]>list[j].toCharArray()[t]){
                        list[n]=list[j];
                        list[j]=list[j-1];
                        list[j-1]=list[n];
                        order[n]=order[j];
                        order[j]=order[j-1];
                        order[j-1]=order[n];
                    }
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(masterList[order[i]]);
        }
        System.out.println("");
    }
}
