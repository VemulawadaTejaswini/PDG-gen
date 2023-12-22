import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main
{


  @SuppressWarnings("unchecked")
  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int   in_N;
    ArrayList<Point> in_red;
    ArrayList<Point> in_blue;

    ArrayList<Point> tmp_blue;
    ArrayList<Point> tmp1;
    ArrayList<Point> tmp2;

    int tmp_x;
    int tmp_y;
    Point tmp_point;

    int cnt;
    int num;
    int cnt2;
    int num2;
    int ans1;
    int ans2;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_red = new ArrayList<Point>();
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");

        in_red.add( new Point(Integer.parseInt(in_str_split[0]), Integer.parseInt(in_str_split[1])) );
      }

      in_blue = new ArrayList<Point>();
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");

        in_blue.add( new Point(Integer.parseInt(in_str_split[0]), Integer.parseInt(in_str_split[1])) );
      }

      /*----------------
       * 計算
       *----------------*/
      ans1 = 0;
      ans2 = 0;

      /* まず、xでソート */
      sort_x(in_red);
      sort_x(in_blue);

      tmp_blue = (ArrayList<Point>)(in_blue.clone());

      /* アルゴリズム1 */
      /* 赤い点をベースに、ペアの青い点を探す */
      num = in_red.size();
      for(cnt=0; cnt<num; cnt++)
      {
        tmp_point = in_red.get(cnt);

        /* 青い点群から、赤のxより大きい部分のみ抽出 */
        tmp1 = sub_array_x(tmp_blue, tmp_point);

        /* 見つかれば、一番若い部分をペアに */
        if(null != tmp1)
        {
          sort_y(tmp1);
          num2 = tmp1.size();
          for(cnt2=0; cnt2<num2; cnt2++)
          {
            if(tmp_point.y < tmp1.get(cnt2).y)
            {
              ans1++;
              tmp_blue.remove(tmp1.get(cnt2));
              break;
            }
          }
        }
      }

      /* アルゴリズム2 */
      /* 赤い点をベースに、ペアの青い点を探す */
      num = in_red.size();
      for(cnt=0; cnt<num; cnt++)
      {
        tmp_point = in_red.get(cnt);

        /* 青い点群から、赤のxより大きい部分のみ抽出 */
        tmp1 = sub_array_x(tmp_blue, tmp_point);

        /* 見つかれば、一番若い部分をペアに */
        if(null != tmp1)
        {
          num2 = tmp1.size();
          for(cnt2=0; cnt2<num2; cnt2++)
          {
            if(tmp_point.y < tmp1.get(cnt2).y)
            {
              ans2++;
              tmp_blue.remove(tmp1.get(cnt2));
              break;
            }
          }
        }
      }

      System.out.println("" + ((ans1<ans2)?ans2:ans1) );
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



  public static void sort_x
  (
    ArrayList<Point> array
  )
  {
    Collections.sort
    (
      array,
      new Comparator<Point>()
      {
        public int compare
        (
          Point obj1,
          Point obj2
        )
        {
          return obj2.x - obj1.x;
        }
      }
    );
  }



  public static void sort_y
  (
    ArrayList<Point> array
  )
  {
    Collections.sort
    (
      array,
      new Comparator<Point>()
      {
        public int compare
        (
          Point obj1,
          Point obj2
        )
        {
          return obj1.y - obj2.y;
        }
      }
    );
  }



  public static ArrayList<Point> sub_array_x
  (
    ArrayList<Point> array,
    Point            point
  )
  {
    ArrayList<Point> ret;
    int              x;
    int              num;
    int              cnt;


    x   = point.x;
    ret = null;

    num = array.size();
    for(cnt=0; cnt<num; cnt++)
    {
      if(x < array.get(cnt).x)
      {
        ret = new ArrayList<Point>(array.subList(cnt, num));
        break;
      }
    }

    return ret;
  }


  static class Point
  {
    public int x;
    public int y;

    public Point
    (
      int x,
      int y
    )
    {
      this.x = x;
      this.y = y;
    }
  }

}
