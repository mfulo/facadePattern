package facadePattern;

public class FrontDesk {
	private HotelService hotelService;
	
	public FrontDesk (HotelService hotelService) {
		this.hotelService = hotelService;
	}
	public void selectService (String data) {
		hotelService.selectService (data);
	}
}
