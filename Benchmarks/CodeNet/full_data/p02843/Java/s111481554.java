import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int list[] = {100,101,102,103,104,105};
        
        int X = stdin.nextInt();
        int flag=0;

        for(int i=0;i<6;i++) {
        	if(X%list[i] == 0) {
        		System.out.print("1");
        		flag=1;
        		break;
        	}
        	for(int j=list.length-1;i<j;j--) {
        		if(X%(list[i]+list[j])==0) {
        			flag=1;
        			break;
        		}
        		for(int k=list.length-1;i<k;k--) {
        			if(X%(list[i]+list[j]+list[k])==0) {
            			flag=1;
            			break;
        			}
        			for(int l=list.length-1;i<l;l--) {
            			if(X%(list[i]+list[j]+list[k]+list[l])==0) {
                			flag=1;
                			break;
            			}
            			for(int m=list.length-1;i<m;m--) {
                			if(X%(list[i]+list[j]+list[k]+list[l]+list[m])==0) {
                    			flag=1;
                    			break;
                			}
                			for(int n=list.length-1;i<n;n--) {
                    			if(X%(list[i]+list[j]+list[k]+list[l]+list[m]+list[n])==0) {
                        			flag=1;
                        			break;
                    			}
                            	if(flag==1) break;
                			}
                        	if(flag==1) break;
            			}
                    	if(flag==1) break;
        			}
                	if(flag==1) break;
        		}
            	if(flag==1) break;
        	}
        	if(flag==1) break;
        }
        if(flag==0) {
        	System.out.print("0");
        }
        else {
			System.out.print("1");
        }
	}
}
