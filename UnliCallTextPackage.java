public class UnliCallTextPackage implements UniversalCallTextOffer {
    @Override
    public String showUniCallsTextOffer(String telcoName, boolean uniCallText) {
        if (uniCallText) {
            return "The " + telcoName + " plan offers unlimited calls and texts.";
        } else {
            return "The " + telcoName + " plan does not offer unlimited calls and texts.";
        }
    }
}
