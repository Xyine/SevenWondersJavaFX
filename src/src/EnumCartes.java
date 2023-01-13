public enum EnumCartes {
    RHODES(2, 2, 2,2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2),
    ALIKARNASS(3,2,2,2,2,1,1,1,2,2,2,2,1,2),
    GIZEH(3,2,1,2,2,2,1,2,1,2,3,2,0,2),
    EPHESOS(3,2,2,2,2,2,1,2,2,1,2,2,1,1),
    OLYMPIE(3,2,1,2,2,2,1,1,2,1,3,2,1,2),
    BABYLON(3,1,2,2,2,2,2,2,1,2,2,2,1,1),
    ALEXANDRIE(4,2,2,2,1,2,2,1,1,2,2,2,1,1),
    PIOCHE(6,4,4,4,4,4,4,4,4,4,8,4,2,4);
    int coin;
    int stone;
    int wood;
    int brick;
    int glass;
    int scroll;
    int wheel;
    int compass;
    int tablet;
    int blue3;
    int blueCat;
    int war;
    int warDouble;
    int warSingle;

    EnumCartes(int coin, int stone, int wood,int brick, int glass, int scroll, int wheel, int compass, int tablet, int blue3, int blueCat, int war, int warDouble, int warSingle) {
        this.coin = coin;
        this.stone = stone;
        this.wood = wood;
        this.brick = brick;
        this.glass = glass;
        this.scroll = scroll;
        this.wheel = wheel;
        this.compass = compass;
        this.tablet = tablet;
        this.blue3 = blue3;
        this.blueCat = blueCat;
        this.war = war;
        this.warDouble = warDouble;
        this.warSingle = warSingle;
    }

}
