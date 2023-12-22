import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String s = sc.next();
        String[] ss = s.split("");

        Long sum = 0L;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                String color1 = ss[i];
                String color2 = ss[j];
                if(color1.equals(color2))continue;
                for(int k=j+1;k<n;k++){
                    String x = ss[k];
                    if((k-j)==(j-i))continue;
                    if(x.equals(color1))continue;
                    if(x.equals(color2))continue;
                    sum+=1;
                }
            }
        }

        System.out.println(sum);
    }
}