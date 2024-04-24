package VisitorPattern;

public class TelcoAllowance implements UsagePromo {
    public String showAllowance(String telcoName, double money) {
        double allowance = getAllowance(telcoName);
        return telcoName + " offers a data allowance of " + allowance + " GB for ₱" + money + " per month.";
    }

    private double getAllowance(String telcoName) {
        switch (telcoName) {
            case "Smart":
                return 15.0;
            case "Globe":
                return 10.0;
            case "Ditto":
                return 8.0;
            default:
                return 0.0;
        }
    }
}

