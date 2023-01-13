public class Etage extends Wonder {
    private int EScore;
    public WEtage() {}
    public WEtage(String Name, int NEtage, int MaxNEtage, int EScore){
        super(Name,NEtage,MaxNEtage);
        this.EScore = EScore;
    }

    public int getEScore() {
        return EScore;
    }
    public void setEScore(int EScore) {
        this.EScore = EScore;
    }

    @Override
    public void Play() {

        switch (NEtage) {
            case 1 :
                EScore = 2;
                break;
            case 2 :
                EScore = 2;
                break;
            case 3 :
                EScore = 3;
                break;
            case 4 :
                EScore = 2;
                break;
            case 5 :
                EScore = 3;
                break;
            default :
                NEtage = MaxNEtage;
        }
        if (NEtage>MaxNEtage){
            NEtage = MaxNEtage;
        }
        if (NEtage== MaxNEtage){
            System.out.println("Partie terminée");
        }
    }
}
