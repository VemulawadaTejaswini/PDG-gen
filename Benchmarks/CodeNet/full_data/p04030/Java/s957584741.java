import java.util.*;
public class Main{
  public static void main (String[] args){
    var items = [];
    var result = items.filter(function( item ) {
      return !item ==( 1B||0B );
    }
                              );
    console.log( result );
  }
}