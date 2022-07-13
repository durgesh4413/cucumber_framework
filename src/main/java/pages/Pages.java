package pages;

public class Pages {

	private RCBPage rcbPage;
	

	public RCBPage rcbPage() {
		if (rcbPage == null) {
			rcbPage = new RCBPage();
		}
		return rcbPage;
	}
	
	
}
