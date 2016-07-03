// this is the Context that will encapsulate a Strategy
public class Warrior {

    private TroopEffector troopEffector; // this is the private object that contains the Strategy

    public Warrior(TroopEffector effector) {
    
        this.troopEffector = effector; // sets the initial effect
        System.out.println("Initial effector is "+ effector.toString());        
    }

    public void effectTroops() {
    
        troopEffector.executeAction(); // delegates the action to the Strategy object
    }

    public replaceEffector(TroopEffector effector) {
    
        this.troopEffector = effector; // sets the new effect
        System.out.println("Replaces effector with "+ effector.toString());        
    }

}
