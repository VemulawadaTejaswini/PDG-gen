public class func{
public void getName(){
                                                return (new URI(toString())).getFragment() == null ? new Path(toUri()).getName()
                                                        : (new URI(toString())).getFragment();
}
}
