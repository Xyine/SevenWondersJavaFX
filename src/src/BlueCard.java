public class BlueCard extends Card{

    private int victoryPoints;
    public BlueCard(String name, int victoryPoints) {

        super(name);
        this.victoryPoints = victoryPoints;
    }

    public int getVictoryPoints(){
        return this.victoryPoints;
    }

    @Override
    public void play() {

    }

}
