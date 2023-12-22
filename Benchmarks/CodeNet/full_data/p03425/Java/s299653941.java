import java.util.*;

public class abc089c{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long cnt=0;
    String name[]=new String[n];
    for(int i=0;i<n;i++) name[i]=sc.next();
    for(int a=0;a<n;a++)
      for(int b=a+1;b<n;b++){
        if(name[a].charAt(0)==name[b].charAt(0)) continue;
        else if(name[b].charAt(0)!='M'&&name[b].charAt(0)!='A'&&name[b].charAt(0)!='R'&&name[b].charAt(0)!='C'&&name[b].charAt(0)!='H') continue;
        for(int c=b+1;c<n;c++){
          if(name[b].charAt(0)==name[c].charAt(0)||name[a].charAt(0)==name[c].charAt(0)) continue;
          else if(name[c].charAt(0)!='M'&&name[c].charAt(0)!='A'&&name[c].charAt(0)!='R'&&name[c].charAt(0)!='C'&&name[c].charAt(0)!='H') continue;
          cnt++;
        }
      }
    System.out.println(cnt);
  }
}