package VisitorPattern;

public class UnliCallTextPackage implements UnliCallTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String packageType = unliCallText ? "Unlimited" : "No unlimited";
        String offer = getUnliCallTextOffer(telcoName);
        return packageType + " calls and text package for " + telcoName + ". " + offer;
    }

    private String getUnliCallTextOffer(String telcoName) {
        switch (telcoName) {
            case "Smart":
                return "However, they do not offer any free calls or texts, and you will be charged per use.";
            case "Globe":
                return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
            case "Ditto":
                return "This plan includes unlimited calls and texts to all networks within the country.";
            default:
                return "Unknown";
        }
    }
}
