//66
public class func{
	public void fillPolyPolygon(Graphics2D g2d,List pols){
            for (int i = 0; i < pols.size(); i++) {
                Polygon2D pol = (Polygon2D)(pols.get(i));
                path.append(pol, false);
            }
            g2d.fill(path);
}
}
