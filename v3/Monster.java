public class Monster extends Character{
    
        public Monster(){
            life = 150;
            strength = (int)Math.random() * 45 + 20;
            defense = 20;
            attack = 3; 
        }
    
        public abstract String toString();
        //Monster is not abstract and does not override abstract method toString() in Monster
        }
    }
