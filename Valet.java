package facadePattern;

public class Valet implements HotelService{
	@Override
	public void selectService(String plateNumber) {
		System.out.println(pickUpVehicle(plateNumber));
	}
	public String pickUpVehicle (String plateNumber) {
		return "Vehicle with plate number \"" + plateNumber + "\" can now be picked up.";
	}
}
