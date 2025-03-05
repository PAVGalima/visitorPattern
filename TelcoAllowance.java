public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        return "The " + telcoName + " plan costs ₱" + money + " with data allowance.";
    }
}
