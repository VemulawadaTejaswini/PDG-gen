//114
public class func{
	public void drawVehicle(Graphics2D g,double simulationTime,RoadMapping roadMapping,Vehicle vehicle){
        g.setPaint(vehicleColor(vehicle, simulationTime));
        g.fill(vehiclePath);
}
}
