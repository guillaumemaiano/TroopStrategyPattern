public class War {

        public static void main(String[] args) {
            
            // Piotr is a warrior, who has healer training. 
            Warrior piotr = new Warrior(new HealAction());
            piotr.effectTroops();  // should display "Heals nearby troops (whether in sight or not)"

            // oh, my... all other officers are dead. Piotr assumes command.
            piotr.setTroopEffector(new RallyAction());
            piotr.effectTroops(); // should display "Rally all troops in sight (whether nearby or not)"

            }
                    
}

