public class Hero extends Character{

    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println(m.name + "に3ポイントのダメージ");
        m.hp -= 3;
    }
}