package sf;

public class FightGame {
    public static void main(String[] args) {
        FighterCharacter ryu = new FighterCharacter("류", 100, 1, 20);
        FighterCharacter ken = new FighterCharacter("켄", 200, 1, 10);

        while (ryu.isAlive() && ken.isAlive()) {
            ryu.attack(ken);
            ken.attack(ryu);

            System.out.println("류의 체력: " + ryu.getHealth());
            System.out.println("켄의 체력: " + ken.getHealth());
        }

        if (ryu.isAlive()) {
            System.out.println("게임 종료. " + ryu.getName() + "가 이겼습니다!");
        } else if (ken.isAlive()) {
            System.out.println("게임 종료. " + ken.getName() + "가 이겼습니다!");
        } else {
            System.out.println("게임 종료. 비겼습니다!");
        }
    }
}
