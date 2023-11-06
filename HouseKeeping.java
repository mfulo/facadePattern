package facadePattern;

public class HouseKeeping implements HotelService{
	@Override
	public void selectService(String roomNumber) {
		System.out.println(cleanRoom(roomNumber));	
	}
	public String cleanRoom (String roomNumber) {
		return "Room \"" + roomNumber + "\" will now be cleaned.";
	}
}
