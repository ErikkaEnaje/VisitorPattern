package VisitorPattern;

public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, "Smart", 500,false);
        TelcoSubscription globe = new Telco(10, "Globe", 450,false);
        TelcoSubscription ditto = new Telco(8, "Ditto", 400,false);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));

    }
}



