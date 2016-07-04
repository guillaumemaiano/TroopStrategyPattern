public class War {

        public static void main(String[] args) {
            
            // Piotr is a warrior, who has healer training. 
            Warrior piotr = new Warrior(new HealerAction());
            piotr.effectTroops();  // should display "Heals nearby troops (whether in sight or not)"

            // oh, my... all other officers are dead. Piotr assumes command.
            piotr.replaceTroopEffector(new RallyAction());
            piotr.effectTroops(); // should display "Rally all troops in sight (whether nearby or not)"
            
           // oh, great. Moscow just sent new Political Officers. Comrade Igor takes command, Piotr can go back to healing.
            piotr.replaceTroopEffector(new HealerAction());
            piotr.effectTroops();  // should display "Heals nearby troops (whether in sight or not)"

            }
                    
}

