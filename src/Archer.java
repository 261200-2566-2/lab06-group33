import java.util.ArrayList;

class Archer extends Character {

    public Archer(int level) {
        super(level);
        hp = 350;
        maxHP = 350;
        defensePower = 2;
        attackPower = 15 + 1.0 * level;
        accessoryNumMax = 3;
        role = "Archer";
        skillcount = new int[] {6,2,2,2};
        skillList = new ArrayList < String > ();
        accessoryList = new ArrayList < Accessory > ();
        skillList.add("Normal Attack");
        skillList.add("Double Shot");
        skillList.add("Piercing Arrow");
        skillList.add("Evasion");
    }

    /** shoot double arrow at the target
     *  effects: target's health power decrease by attackPower * 2
     *  effects: print target's health power bar after damaged
     *  effects: print text let player know that you cant attack because you are dead
     *  @param target Character to take damage
     */

    public void doubleShot(Character target) {
        if (isAlive()) {
            skillcount[1]--;
            if (skillcount[1] > 0) {
                System.out.println();
                System.out.println(role + " shoots two arrows at " + target.role);
                target.hp -= Math.round(attackPower * 2 * 5) / 5d;
                if (target.hp < 0)
                    target.hp = 0;
                // System.out.println(target.role + "'s current HP: " + target.hp);
                displayHealthBar();
                target.displayHealthBar();
            }
        } else {
            System.out.println(role + " is dead and cannot attack!");
        }
    }

    /** arrow that pierce through character
     *  effects: target's health power decrease by attackPower * 1.3
     *  effects: print target's health power bar after damaged
     *  effects: print text let player know that you cant attack because you are dead
     *  @param target Character that take damage        

     */

    public void piercingArrow(Character target) {
        if (isAlive()) {
            skillcount[2]--;
            if (skillcount[2] > 0) {
                System.out.println();
                System.out.println(role + " shoots a piercing arrow at " + target.role);
                target.hp -= Math.round(attackPower * 1.3 * 5) / 5d;
                if (target.hp < 0)
                    target.hp = 0;
                System.out.println("The arrow pierce thru " + target.role + " shield");
                target.displayHealthBar();
            }

        } else {
            System.out.println(role + " is dead and cannot attack!");
        }

    }

    public void evation(Character target) {
        if (isAlive()) {
            skillcount[3]--;
            if (skillcount[3] > 0) {
                System.out.println();
                System.out.println(role + " evades " + target.role + "'s attack");
                // System.out.println(target.role + "'s current HP: " + target.hp);
                displayHealthBar();
                target.displayHealthBar();
            }

        } else {
            System.out.println(role + " is dead and cannot attack!");
        }

    }

}