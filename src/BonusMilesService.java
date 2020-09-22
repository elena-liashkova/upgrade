public class BonusMilesService {
    public int calculate(int cost) {
        int mileCost = 20;
        int mileBonus = (int)cost / mileCost;
        return mileBonus;
    }
}
