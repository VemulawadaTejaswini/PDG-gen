//119
public class func{
public void paintSortIndicator(Graphics2D graphics2d,TableUtils.SortDirection sortDirection){
        graphics2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.translate(x, y);
        graphics2d.setColor(SORT_ICON_COLOR);
        graphics2d.fill(sortShape);
}
}
