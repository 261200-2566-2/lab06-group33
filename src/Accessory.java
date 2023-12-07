abstract class Accessory {
    protected String name;
    protected int level;
    protected int bonusAttackPower;
    protected int bonusDefencePower;

    public Accessory(int level) {
        this.level = level;
    }

    /**
     * Levels up the accessory
     */

    public void levelUp() {
        level++;
    }

    /**
     * Levels up the accessory by a specified amount
     * @param l The amount to level up the accessory
     */

    public void levelUp(int l) {
        level = level + l;
    }

}