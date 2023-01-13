import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    protected Wonder wonder;
    protected int score;
    protected int etage;
    protected int carte; // ajouter dans la classe carte les types de cartes (G/D/M)
    public String name;
    public Player(int score, int etage,String name) {
        this.score = score;
        this.etage = etage;
        this.name = name;
    }

    public void setWonder(Wonder wonder) {
        this.wonder = wonder;
    }

    public void piocher(){
        System.out.println(" piocher à gauche (G),à droite (D) ou au milieu (M) ?");
        String P = scanner.nextLine();
        if(P.equals("G")){
            carte += 1; // Gcarte
        }else if(P.equals("D")){
            carte += 1; // Dcarte
        }else if(P.equals("M")){
            carte += 1; // MCarte
        }

    }
    public void construire(){}
    public void guerre(){}
    public void acheterJetonScience(){}

}
