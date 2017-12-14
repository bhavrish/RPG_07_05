public class Monster extends Character{
    
        public Monster(){
            life = 150;
            strength = (int)Math.random() * 45 + 20;
            defense = 20;
            attack = 3; 
        }
    }