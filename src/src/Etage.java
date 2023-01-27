public class Etage extends Wonder {
    private int EScore;

    public WEtage(String Name, int nEtage, int maxnEtage, int EScore){
        super(Name,nEtage,maxnEtage);
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

        switch (nEtage) {
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
                nEtage = maxnEtage;
        }
        if (nEtage>maxnEtage){
            nEtage = maxnEtage;
        }
        if (nEtage== maxnEtage){
            System.out.println("Partie terminée");
        }
    }
}
