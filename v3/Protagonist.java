public abstract class Protagonist extends Character{
    private String name; 

    public Protagonist(String n){
        name = n; 
        life = 125;
        strength = 100;
        defense = 40;
        attack = 5; 
    }

    public String getName(){
        return name; 
    }


    public void specialize(){
        defense -= 5;
        attack += 5;
    }

    public void normalize(){
        defense += 5;
        attack -= 5; 
    }
    
    public abstract String toString();
    //Protagonist is not abstract and does not override abstract method toString() in Protagonist
    }
