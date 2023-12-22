import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int in_N;
    int in_M;
    int in_A;
    int in_B;

    int cnt_N;
    int cnt_M;
    int cnt_A;
    int cnt_B;

    int pos_N;
    int pos_M;
    int proc_A;
    int proc_B;

    boolean    is_abort;
    String[][] ans;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*------------------------------------
       * 引数
       *------------------------------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N = Integer.parseInt(in_str_split[0]);
      in_M = Integer.parseInt(in_str_split[1]);
      in_A = Integer.parseInt(in_str_split[2]);
      in_B = Integer.parseInt(in_str_split[3]);


      ans = new String[in_N][in_M];
      for(cnt_N=0; cnt_N<in_N; cnt_N++)
      {
        for(cnt_M=0; cnt_M<in_M; cnt_M++)
        {
          ans[cnt_N][cnt_M] = ".";
        }
      }

      proc_A = 0;
      proc_B = 0;
      pos_N  = 0;
      pos_M  = 0;

      /*------------------------------------
       * タイル枚数オーバー
       *------------------------------------*/
      if( (in_N * in_M) < (in_A + in_B) * 2)
      {
        /* Nothing to do. */
      }
      else if( (1 <= in_A) && (in_M < 2) )
      {
        /* Nothing to do. */
      }
      else if( (1 <= in_B) && (in_N < 2) )
      {
        /* Nothing to do. */
      }
      else
      {
        is_abort  = false;

        /* A,Bどちらが多いか？ */
        if(in_B < in_A)
        {
          /* A側の処理 */
          for(cnt_A=0; cnt_A<in_A; cnt_A++)
          {
            ans[pos_N][pos_M    ] = "<";
            ans[pos_N][pos_M + 1] = ">";
            proc_A++;

            if(pos_N < (in_N - 1))
            {
              pos_N++;
            }
            else
            {
              if(pos_M < (in_M - 3))
              {
                pos_N  = 0;
                pos_M += 2;
              }
              else
              {
                break;
              }
            }
          } /* for(cnt_A=0; cnt_A<in_A; cnt_A++) */

          /* A側が成功したなら */
          if(in_A <= proc_A)
          {
            /* Bに行く前にpos_Nの調整 */
            if(pos_N <= (in_N-2))
            {
              /* Nothing to do. */
            }
            else
            {
              if(pos_M < (in_M - 1))
              {
                pos_M++;
              }
              else
              {
                is_abort = true;
              }
            }

            if(!is_abort)
            {
              for(cnt_B=0; cnt_B<in_B; cnt_B++)
              {
                ans[pos_N    ][pos_M] = "^";
                ans[pos_N + 1][pos_M] = "v";
                proc_B++;

                if(pos_N < (in_N - 3))
                {
                  pos_N += 2;
                }
                else
                {
                  if(pos_M < (in_M - 1))
                  {
                    if(1 == (pos_M % 2))
                    {
                      pos_N = 0;
                    }
                    pos_M++;
                  }
                  else
                  {
                    break;
                  }
                }

              } /* for(cnt_B=0; cnt_B<in_B; cnt_B++) */
            }   /* (!is_abort)                       */
          }     /* (in_A <= proc_A)                  */
        }
        else /* (in_B < in_A) */
        {
          /* B側の処理 */
          for(cnt_B=0; cnt_B<in_B; cnt_B++)
          {
            ans[pos_N    ][pos_M] = "^";
            ans[pos_N + 1][pos_M] = "v";
            proc_B++;

            if(pos_M < (in_M - 1))
            {
              pos_M++;
            }
            else
            {
              if(pos_N < (in_N - 3))
              {
                pos_M  = 0;
                pos_N += 2;
              }
              else
              {
                break;
              }
            }
          } /* for(cnt_A=0; cnt_A<in_A; cnt_A++) */

          /* A側が成功したなら */
          if(in_B <= proc_B)
          {
            /* Bに行く前にpos_Nの調整 */
            if(pos_M <= (in_M-2))
            {
              /* Nothing to do. */
            }
            else
            {
              if(pos_N < (in_N - 1))
              {
                pos_N++;
              }
              else
              {
                is_abort = true;
              }
            }

            if(!is_abort)
            {
              for(cnt_A=0; cnt_A<in_A; cnt_A++)
              {
                ans[pos_N][pos_M] = "<";
                ans[pos_N][pos_M] = ">";
                proc_A++;

                if(pos_M < (in_M - 3))
                {
                  pos_M += 2;
                }
                else
                {
                  if(pos_N < (in_N - 1))
                  {
                    if(1 == (pos_N % 2))
                    {
                      pos_M = 0;
                    }
                    pos_N++;
                  }
                  else
                  {
                    break;
                  }
                }

              } /* for(cnt_B=0; cnt_B<in_B; cnt_B++) */
            }   /* (!is_abort)                       */
          }     /* (in_A <= proc_A)                  */
        }
      }

      if( (proc_A < in_A) || (proc_B < in_B) )
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");

        for(cnt_N=0; cnt_N<in_N; cnt_N++)
        {
          for(cnt_M=0; cnt_M<in_M; cnt_M++)
          {
            System.out.print(ans[cnt_N][cnt_M]);
          }
          System.out.print("\n");
        }
      }


//      System.out.println("in_N=" + in_N);
//      System.out.println("in_x=" + in_M);
//      System.out.println("in_y=" + in_A);
//      System.out.println("in_y=" + in_B);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
