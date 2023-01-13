public class Wonder {
    protected String Name;
    protected int numberEtageConstruit;
    protected int etageScore;

    public Wonder() {};

    public String getName(){
        return Name;
    }
    public int getNumberEtageConstruit(){
        return numberEtageConstruit;
    }
    public int getEtageScore() {
        return etageScore;
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
}
