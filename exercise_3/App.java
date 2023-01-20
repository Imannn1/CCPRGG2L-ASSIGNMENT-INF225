public class App {
    public static void main(String[] args)  {
       
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Weapon Commonsword = new Weapon();

         Commonsword.name = "Common Sword";
         Commonsword.damage = 5;
         Commonsword.rarity = "Common";
         Commonsword.tellName();
         Commonsword.tellmyDamage();
         Commonsword.tellmyRarity();
         Commonsword.addDamage(50);
         Weapon Raresword = new Weapon();

         Raresword.name = "Rare Sword";
         Raresword.damage = 20;
         Raresword.rarity = "Rare";
         Raresword.tellName();
         Raresword.tellmyDamage();
         Raresword.tellmyRarity();
         Raresword.addDamage(100);
         Weapon Legendarysword = new Weapon();

         Legendarysword.name = "Legendary Sword";
         Legendarysword.damage = 1000;
         Legendarysword.rarity = "Legendary";
         Legendarysword.tellName();
         Legendarysword.tellmyDamage();
         Legendarysword.tellmyRarity();
         Legendarysword.addDamage(1000);
         System.out.println(Legendarysword.shownameandrarity());

         Character Devil = new Character();

        Devil.strength = 99999;
        Devil.agility = 99999;
        Devil.intelligence = 99999;
        Devil.name = "Anos";
        Devil.sayMyName();
        Devil.doAttack();

    }
}

