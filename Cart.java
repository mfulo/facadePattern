package facadePattern;

public class Cart implements HotelService{
	@Override
	public void selectService(String numberOfCarts) {
		System.out.println(requestCart(numberOfCarts));	
	}
	public String requestCart (String numberOfCarts) {
		return numberOfCarts + " cart/s will now be delivered at the front desk.";
	}
}
