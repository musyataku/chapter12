public class Thief extends Character{

    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }
}