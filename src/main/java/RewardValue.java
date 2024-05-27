public class RewardValue {
    private final double value; // Represents the value in terms of miles or cash
    private final String conversionType; // "CASH" or "MILES"
    private static final double CONVERSION_RATE = 0.0035; // Conversion rate from cash to miles

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.value = cashValue;
        this.conversionType = "CASH";
    }
    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.value = milesValue;
        this.conversionType = "MILES";
    }
    // Method to get the value as miles
    public int getMilesValue() {
        if (conversionType.equals("CASH")) {
            // Convert cash to miles
            return (int) (value / CONVERSION_RATE);
        } else {
            // Return miles directly
            return (int) value;
        }
    }

    // Method to get the value as cash
    public double getCashValue() {
        if (conversionType.equals("MILES")) {
            // Convert miles to cash
            return value * CONVERSION_RATE;
        } else {
            // Return cash directly
            return value;
        }
    }
}
