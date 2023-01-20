public class Weapon {   
       
        String name;
        int damage;
        String rarity;

        public void tellName() {
            System.out.println("Weapon is"+ name);
        }
        public void tellmyDamage() {
            System.out.println("Damage"+ damage);
        }
        public void tellmyRarity() {
            System.out.println("Rarity"+ rarity);
        }
        
        public void addDamage(int additionalDamage) {
        int newDamage = this.damage + additionalDamage;
        System.out.println("Damage increased from"+ damage +" to "+ newDamage );

        this.damage = newDamage;
        }
        public String shownameandrarity() {
            return this.name + " " + this.rarity;
        }   
  }
           
