public class HealerAction implements TroopEffector {

        @Override 
        public void executeAction() {
        
            System.out.println("Heals nearby troops (whether in sight or not)");
        }


        @Override
        public String toString() {
        
            System.out.println("I can now heal troops by my mere presence. I have the power!");
        }
}
