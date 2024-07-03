package PjtPawnShop;

class MobilePhone extends ElectronicDevice {
    private boolean supported5GNetwork;

    public MobilePhone(int IMEI, String manufacturer, double priceOfPledge, boolean supported5GNetwork) {
        super(IMEI, manufacturer, priceOfPledge);
        this.supported5GNetwork = supported5GNetwork;
    }

    @Override
    public void calculateSellingPrice() {
        sellingPrice = priceOfPledge + (supported5GNetwork ? 0.4 : 0.3) * priceOfPledge;
    }
    
    @Override
    public String getDeviceInfo() {
        return "Mobile Phone - IMEI: " + IMEI + ", Manufacturer: " + manufacturer +
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
