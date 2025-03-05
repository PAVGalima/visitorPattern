interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UniversalCallTextOffer uniPackage, boolean uniCallText);
}
