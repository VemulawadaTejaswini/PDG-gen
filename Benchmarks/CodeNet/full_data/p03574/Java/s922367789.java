import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        String[] ans = new String[H];
        String st = ".#";

        for(int i=0; i<H; i++){
            S[i] = sc.next();
        }
        for(int i=0; i<H; i++){
            ans[i] = "";
            for(int j=0; j<W; j++){
                int x = 0;
                if(i==0){
                    if(j==0){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            else if(S[i+1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            else if(S[i+1].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j==W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j!=0 && j!=W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            for(int k=j-1; k<=j+1; k++){
                                if(S[i+1].charAt(k)==st.charAt(1)){
                                    x += 1;
                                }
                            }
                        }
                    }
                }

                else if(i==H-1){
                    if(j==0){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j==W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j!=0 && j!=W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            for(int k=j-1; k<=j+1; k++){
                                if(S[i-1].charAt(k)==st.charAt(1)){
                                    x += 1;
                                }
                            }
                        }
                    }
                }

                else{
                    if(j==0){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j==W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i-1].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i+1].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                        }
                    }
                    else if(j!=0 && j!=W-1){
                        if(S[i].charAt(j)==st.charAt(0)){
                            if(S[i].charAt(j-1)==st.charAt(1)){
                                x += 1;
                            }
                            if(S[i].charAt(j+1)==st.charAt(1)){
                                x += 1;
                            }
                            for(int k=j-1; k<=j+1; k++){
                                if(S[i-1].charAt(k)==st.charAt(1)){
                                    x += 1;
                                }
                            }
                            for(int k=j-1; k<=j+1; k++){
                                if(S[i+1].charAt(k)==st.charAt(1)){
                                    x += 1;
                                }
                            }
                        }
                    }
                }

                if(x>0){
                    ans[i] += String.valueOf(x);
                }
                else if(x==0){
                    ans[i] += "#";
                }
            }
            System.out.println(ans[i]);
        }
    }
}