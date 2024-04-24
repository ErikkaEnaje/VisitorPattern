package VisitorPattern;

public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

public Telco(double promoPrice, String telcoName, int dataAllowance, boolean unliCallText){
    this.telcoName = telcoName;
    this.dataAllowance = dataAllowance;
    this.unliCallText = unliCallText;
    this.promoPrice = promoPrice;
}

    public String getTelcoName() {
        return telcoName;
    }

    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
    public double getPromoPrice() {
        return promoPrice;
    }


    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price) {
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, price);
    }
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}
