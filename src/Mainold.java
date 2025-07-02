public class Mainold {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "勇者";
        h.attack(new Matango());
        h.attack(new Goblin());
        h.attack(new Slime());

        //Wizard w = new Wizard();
        //Character c = new Wizard();
        Character[] c = new Character[1];
        c[0] = new Wizard();
        Wizard w = (Wizard) c[0];
        w.name = "魔法使い";
        w.attack(new Goblin());
        w.attack(new Slime());
    }
}