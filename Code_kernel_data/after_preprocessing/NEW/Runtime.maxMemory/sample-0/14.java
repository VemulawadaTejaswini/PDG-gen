//14
public class func{
public void monitor15(){
      Runtime rt = Runtime.getRuntime();
      log.log( "Thread state: elapsed=" + elapsed + ",cpu=" + total_diffs + ",max=" + thread_name + "(" + biggest_diff + "/" + percent + "%),mem:max=" + (rt.maxMemory()/1024)+",tot=" + (rt.totalMemory()/1024) +",free=" + (rt.freeMemory()/1024));
      if ( biggest_diff > time_available/4 ){
        
        info = bean.getThreadInfo( ids[biggest_index ], 255 );
        
        if ( info == null ){
          
          log.log( "    no info for max thread" );
          
        }else{
          
          StackTraceElement[] elts = info.getStackTrace();
          StringBuilder str = new StringBuilder(elts.length * 20);
          
          str.append("    ");
          for (int i=0;i<elts.length;i++){
            if(i != 0)
              str.append(", ");
            str.append(elts[i]);
          }
          
          log.log( str.toString() );
        }
      }
}
}
