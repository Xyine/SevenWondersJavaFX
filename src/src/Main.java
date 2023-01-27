import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public List<Player> players ;
    public List<Wonder> wonders;
    
    List<Wonder> availableWonders;

    private int numberOfPlayers;

    Scanner scanner;
    

    public Main(){
        this.players = new ArrayList<>();
        this.wonders = new ArrayList<>();
        scanner =  new Scanner(System.in);

    }
    public void fillWonders(){
        Wonder Alexendrie = new Alexendrie(0,5,EnumCartes.ALEXANDRIE) ;
        Wonder Ephese = new Ephese(0,5,EnumCartes.EPHESOS);
        Wonder Babylone = new Babylone(0,5,EnumCartes.BABYLON);
        Wonder Rhodes = new Rhodes(0,0,EnumCartes.RHODES);
        Wonder Halicarnasse = new Halicarnasse(0,0,EnumCartes.ALIKARNASS);
        Wonder Olympie = new Olympie(0,0,EnumCartes.OLYMPIE);
        Wonder Gizeh = new Gizeh(0,0,EnumCartes.GIZEH);
        this.availableWonders.add(Alexendrie);
        this.availableWonders.add(Ephese);
        this.availableWonders.add(Babylone);
        this.availableWonders.add(Rhodes);
        this.availableWonders.add(Halicarnasse);
        this.availableWonders.add(Olympie);
        this.availableWonders.add(Gizeh);
    }

    public void game() {
        System.out.println("combien de joueurs y a t il? (2 à 7)");
        numberOfPlayers = scanner.nextInt();
        while (numberOfPlayers < 2 || numberOfPlayers > 7) {
            System.out.println("Il ne peut y avoir qu'entre 2 et 7 joueurs");
            numberOfPlayers = scanner.nextInt();
        }
        initializePlayersAndWonders();

        while (!isGameFinished()) {
            playTurn();
        }
    }

    /**
     * Initialize the players and their wonders at the start of the game.
     */
    public void initializePlayersAndWonders(){
        for (int i=1; i<=numberOfPlayers; i++) {
            System.out.println("Choisissez votre nom");
            String name = scanner.nextLine();
            System.out.println("Choisissez votre merveille! (Alexandrie, Ephese, Babylone, Rhodes, Halicarnasse, Olympie, Gizeh)");
            String wonderName = scanner.nextLine();
            if (doesWonderExist(wonderName)){
                Player player = new Player(0,0,0,false,false,false,false,false,false,false,false,false,false,false,false,false,false,name);
                Wonder wonder = availableWonders.remove(getWonder(wonderName));
                players.add(player);
                wonders.add(wonder);
            }
        }
    }

    public boolean isGameFinished(){
        for(Wonder wonder : wonders){
            if (wonder.getNumberEtageConstruit() == 5)
                return true;
        }
        return false;
    }

    public void playTurn(){
        for (int i=1; i<=numberOfPlayers; i++) {

            players.get(i).wonder.effetSpecial();
            players.get(i).piocher();
            players.get(i).construire();
            players.get(i).acheterJetonScience();
            players.get(i).guerre();
        }
    }
    public static void main(String[] args) {
        Main game = new Main();
        game.fillWonders();
        game.game();
        game.scanner.close();
    }

    public boolean doesWonderExist(String name) {
        for (Wonder wonder : availableWonders) {
            if (name.equals(wonder.getName()))
                return true;
        }
        return false;
    }

    public int getWonder(String name){
        for(int i = 0; i < availableWonders.size(); i++) {
            if (name.equals(availableWonders.get(i).getName()))
                return i;
        }
        throw new IllegalArgumentException();
    }
}

