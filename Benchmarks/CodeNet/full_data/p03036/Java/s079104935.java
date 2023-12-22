using System;
using System.Collections.Generic;

namespace atcoder
{
  class Program
  {
    static void Main(string[] args)
    {

      var line = Console.ReadLine().Split();
      var r = int.Parse(line[0]);
      int D = int.Parse(line[1]);
      int x2000 = int.Parse(line[2]);

      int nextX = x2000;
      for (int i = 1; i <= 10; i++)
      {
          nextX = r * nextX - D;
          System.Console.WriteLine(nextX);
      }

    //   Console.ReadLine();
    }
  }
}
