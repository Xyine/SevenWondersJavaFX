import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    protected Wonder wonder;
    protected int pointVictoire;
    private int bouclier;
    protected int etage;
    private boolean jetonUrbanism;
    private boolean jetonArtisanat;
    private boolean jetonJoaillerie;
    private boolean jetonScience;
    private boolean jetonPropagande;
    private boolean jetonArchitecture;
    private boolean jetonEconomie;
    private boolean jetonIngenierie;
    private boolean jetonTactique;
    private boolean jetonDecoration;
    private boolean jetonPolitique;
    private boolean jetonStrategie;
    private boolean jetonEducation;
    private boolean jetonCulture;
    protected int carte; // ajouter dans la classe carte les types de cartes (G/D/M)
    public String name;
    public Player(int pointVictoire, int etage, int bouclier, boolean jetonUrbanisme, boolean jetonArtisanat, boolean jetonJoaillerie, boolean jetonScience, boolean jetonPropagande, boolean jetonArchitecture, boolean jetonEconomie, boolean jetonIngenierie, boolean jetonTactique, boolean jetonDecoration, boolean jetonPolitique, boolean jetonStrategie, boolean jetonEducation, boolean jetonCulture, String name) {
        this.pointVictoire = pointVictoire;
        this.etage = etage;
        this.bouclier = bouclier;
        this.jetonArchitecture = jetonArchitecture;
        this.jetonCulture = jetonCulture;
        this.jetonArtisanat = jetonArtisanat;
        this.jetonDecoration = jetonDecoration;
        this.jetonEconomie = jetonEconomie;
        this.jetonEducation = jetonEducation;
        this.jetonIngenierie = jetonIngenierie;
        this.jetonJoaillerie = jetonJoaillerie;
        this.jetonPolitique = jetonPolitique;
        this.jetonPropagande = jetonPropagande;
        this.jetonScience = jetonScience;
        this.jetonStrategie = jetonStrategie;
        this.jetonTactique = jetonTactique;
        this.jetonUrbanism = jetonUrbanisme;
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
    public void addVictoryPoints(int points) {
        this.pointVictoire += points;
    }
    public void addBouclier() {
        this.bouclier ++;
    }
    public boolean isJetonUrbanism() {
        return jetonUrbanism;
    }

    public void setJetonUrbanism(boolean jetonUrbanism) {
        this.jetonUrbanism = jetonUrbanism;
    }

    public boolean isJetonArtisanat() {
        return jetonArtisanat;
    }

    public void setJetonArtisanat(boolean jetonArtisanat) {
        this.jetonArtisanat = jetonArtisanat;
    }

    public boolean isJetonJoaillerie() {
        return jetonJoaillerie;
    }

    public void setJetonJoaillerie(boolean jetonJoaillerie) {
        this.jetonJoaillerie = jetonJoaillerie;
    }

    public boolean isJetonScience() {
        return jetonScience;
    }

    public void setJetonScience(boolean jetonScience) {
        this.jetonScience = jetonScience;
    }

    public boolean isJetonPropagande() {
        return jetonPropagande;
    }

    public void setJetonPropagande(boolean jetonPropagande) {
        this.jetonPropagande = jetonPropagande;
    }

    public boolean isJetonArchitecture() {
        return jetonArchitecture;
    }

    public void setJetonArchitecture(boolean jetonArchitecture) {
        this.jetonArchitecture = jetonArchitecture;
    }

    public boolean isJetonEconomie() {
        return jetonEconomie;
    }

    public void setJetonEconomie(boolean jetonEconomie) {
        this.jetonEconomie = jetonEconomie;
    }

    public boolean isJetonIngenierie() {
        return jetonIngenierie;
    }

    public void setJetonIngenierie(boolean jetonIngenierie) {
        this.jetonIngenierie = jetonIngenierie;
    }

    public boolean isJetonTactique() {
        return jetonTactique;
    }

    public void setJetonTactique(boolean jetonTactique) {
        this.jetonTactique = jetonTactique;
    }

    public boolean isJetonDecoration() {
        return jetonDecoration;
    }

    public void setJetonDecoration(boolean jetonDecoration) {
        this.jetonDecoration = jetonDecoration;
    }

    public boolean isJetonPolitique() {
        return jetonPolitique;
    }

    public void setJetonPolitique(boolean jetonPolitique) {
        this.jetonPolitique = jetonPolitique;
    }

    public boolean isJetonStrategie() {
        return jetonStrategie;
    }

    public void setJetonStrategie(boolean jetonStrategie) {
        this.jetonStrategie = jetonStrategie;
    }

    public boolean isJetonEducation() {
        return jetonEducation;
    }

    public void setJetonEducation(boolean jetonEducation) {
        this.jetonEducation = jetonEducation;
    }

    public boolean isJetonCulture() {
        return jetonCulture;
    }

    public void setJetonCulture(boolean jetonCulture) {
        this.jetonCulture = jetonCulture;
    }


}
