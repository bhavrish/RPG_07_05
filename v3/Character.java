public class Character{
    protected int life; 
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive(){
        return life > 0;
    }
        
    public int getDefense(){
        return defense;
    }

    public void lowerHP(int loss){
        life -= loss; 
    }

    public int attack(Character role){
        int damage = (strength * attack) - role.defense;
        return damage;
}
