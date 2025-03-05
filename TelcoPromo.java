public class TelcoPromo {
    public static void main(String[] args) {


        System.out.println();
        Telco smart = new Telco("Smart", 500, 15, false);
        Telco globe = new Telco("Globe", 450, 10, true);
        Telco ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo usagePromo = new TelcoAllowance();
        UniversalCallTextOffer uniCallTextOffer = new UnliCallTextPackage();

        // Applying the Visitor pattern for different Telco plans
        System.out.println(smart.accept(usagePromo, smart.getPromoPrice()));
        System.out.println(smart.accept(uniCallTextOffer, smart.isUniCallText()));

        System.out.println(globe.accept(usagePromo, globe.getPromoPrice()));
        System.out.println(globe.accept(uniCallTextOffer, globe.isUniCallText()));

        System.out.println(ditto.accept(usagePromo, ditto.getPromoPrice()));
        System.out.println(ditto.accept(uniCallTextOffer, ditto.isUniCallText()));
        System.out.println();
        
    }
}
