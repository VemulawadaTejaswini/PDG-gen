//8
public class func{
public void drawComponentSelectionBox(Graphics2D g,LWComponent c){
        if (CHS % 2 == 0) {
            // if box size is even, bias to inside the selection border
            r.height--;
            r.width--;
        }
        ComponentHandle.setFrame(r.x, r.y , CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x, r.y + r.height, CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x + r.width, r.y, CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x + r.width, r.y + r.height, CHS, CHS);
        g.fill(ComponentHandle);
}
}
