//0
public class func{
public void createLayerAt(Component component,Dockable dockable){
    JPanel panel = new JPanel( new GridLayout( 1, 1 ));
    panel.add( component );
    panel.setOpaque( false );
}
}
