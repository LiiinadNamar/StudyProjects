package PjtPawnShop;

class Tablet extends ElectronicDevice {
	private boolean allowedPhoneCall; 

    public Tablet(int IMEI, String manufacturer, double priceOfPledge, boolean allowedPhoneCall ) {
        super(IMEI, manufacturer, priceOfPledge);
        this.allowedPhoneCall = allowedPhoneCall;
    }

    @Override
    public void calculateSellingPrice() {
        sellingPrice = priceOfPledge * 1.3;
    }
    
    @Override
    public String getDeviceInfo() {
        return "Tablet - IMEI: " + IMEI + ", Manufacturer: " + manufacturer +
                ", Price of Pledge: " + priceOfPledge + ", Selling Price: " +
                sellingPrice + ", Allowed for Sale: " + (allowedForSale ? "Yes" : "No") +
                ", Sold: " + (sold ? "Yes" : "No");
    }
    @Override
    public double getSellingPrice() {
        calculateSellingPrice(); 
        return sellingPrice;
    }
}

