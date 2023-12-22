using System;
namespace AtCoder
{
public class Program
    {
        public static void Main(string[] args)
        {
       		string s = Console.ReadLine();
            int n = s.Length;
            int cnt = 1;
            string before_s = s.Substring(0,1);
          	int range = 1;
            for(int i = 1; i < n; i++)
            {
              	string ts = s.Substring(i-range+1,range);
           		//Console.WriteLine(before_s + " " +ts);
                if(!ts.Equals(before_s))
                {
                    before_s = ts;
                    cnt++;
                  	range = 1;
                }else{
                 	range++;
                }
                
	        }
            Console.WriteLine(cnt);
        }
	}
}