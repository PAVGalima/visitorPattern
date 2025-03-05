public class Telco  implements TelcoSubscription {
    private final String telcoName;
    private  final double promoPrice;
    private final int dataAllowance;
    private final  boolean uniCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean uniCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.uniCallText = uniCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UniversalCallTextOffer uniPackage, boolean uniCallText) {
        return uniPackage.showUniCallsTextOffer(telcoName, uniCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean isUniCallText() {
        return uniCallText;
    }
}
