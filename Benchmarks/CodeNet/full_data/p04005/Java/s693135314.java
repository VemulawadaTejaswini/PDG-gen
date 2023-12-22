using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] A = new int[3];
            A[0] = int.Parse(Console.ReadLine());
            A[1] = int.Parse(Console.ReadLine());
            A[2] = int.Parse(Console.ReadLine());
            Array.Sort(A);
            Console.WriteLine(A[0]*A[1]*(A[2]-A[2]/2)-(A[0] * A[1] * (A[2] / 2)));

        }
    }
}