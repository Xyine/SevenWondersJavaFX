public class Wonder {

    protected int numberEtageConstruit;
    protected int etageScore;
    private String name;
    private Pioche pioche;
    private EnumCartes formation;

    public Wonder(int nEtage,int maxnEtage, EnumCartes formation, String name) {
        this.etageScore = nEtage;
        this.name = name;
        this.numberEtageConstruit = maxnEtage;
        this.formation = formation;
        this.pioche = new Pioche(formation);
    }


    public int getNumberEtageConstruit(){
        return numberEtageConstruit;
    }
    public int getEtageScore() {
        return etageScore;
    }

    public String getName() {
        return name;
    }

    public void max(){
        if (numberEtageConstruit > 5){
            numberEtageConstruit = 5;
        }
        if (numberEtageConstruit == 5){
            System.out.println("Partie terminée");
        }
    }
    public void effetSpecial(){}

    public Pioche getPioche() {
        return pioche;
    }
}
