package VisitorPattern;

public interface TelcoSubscription {
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText);
    public String accept(UsagePromo usagePromo, double price);
    public String getTelcoName();
    public Integer getDataAllowance();
    public boolean getUnliCallText();
    public double getPromoPrice();
}


