public class func{
public void begin(Entity e,Object drawState){
        gr.setColor( clr.darker() );
        gr.fill( path );
        gr.scale( 0.9f, 0.9f );
        gr.setColor( clr );
        gr.fill( path );
        gr.setTransform( popped );
}
}
