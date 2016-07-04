public class RallyAction implements TroopEffector {

        @Override 
        public void executeAction() {
        
            System.out.println("Rally all troops in sight (whether nearby or not)");
        }


        @Override
        public String toString() {
        
            return "Troops will now rally to my banner";
        }
}
