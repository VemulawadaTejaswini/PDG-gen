public class func{
public void paintComponent(Graphics g){
            for (Map.Entry<Packet.Sensor, Integer> entry : packet.getSensors().entrySet()) {
                double y = 20 * (entry.getValue() - offset) / 2048.0;
                Shape shape = new Rectangle.Double(x, y + 15 * entry.getKey().ordinal(), 2, 2);
                g2.fill(shape);
            }
}
}
