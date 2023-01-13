

public class MilitaryCard extends Card {
    private int strength;
    private int corne;

    public MilitaryCard(String name, int corne) {
        super(name);
        this.corne = corne;
    }

    @Override
    public void play() {
        // Ajouter les points de militarie au joueur
    }
}
