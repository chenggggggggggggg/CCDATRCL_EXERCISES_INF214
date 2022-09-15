public class App {
    public static void main(String[] args) {

        // Character Class
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
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();


        // Weapon Class
       Weapon katana = new Weapon();
       katana.name = "K9 Unit";
       katana.damage = 200;
       katana.weight = 1.5;
       katana.rarity = "Epic";
       katana.description = "A lethal one-hit-kill Operator Skill that slices and dices the opposition.";
       katana.MyWeapon();

       Weapon thumper = new Weapon();
       thumper.name = "Surprise Party";
       thumper.damage = 150;
       thumper.weight = 4.5;
       thumper.rarity = "Legendary";
       thumper.description = "Turn opponents into ashes.";
       thumper.MyWeapon();

       Weapon CBR4 = new Weapon();
       CBR4.name = "Amoeba";
       CBR4.damage = 24;
       CBR4.weight = 3.5;
       CBR4.rarity = "Mythic";
       CBR4.description = "Versatile weapon that has a definite skill gap.";
       CBR4.MyWeapon();

    }
}