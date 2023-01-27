import java.util.ArrayList;
import java.util.List;


public class Pioche {
    private List<Card> pioche = new ArrayList<>();
    EnumCartes formation;


    public Pioche(EnumCartes formation){
        this.formation = formation;
        initPioche();
    }


    public void initPioche(){
        for (int i = 0; i < formation.coin; i++) {
            this.pioche.add(new ResourceCard("Gold",TypeRessources.GOLD));
        }
        for (int i = 0; i < formation.stone; i++) {
            this.pioche.add(new ResourceCard("Stone",TypeRessources.STONE));
        }
        for (int i = 0; i < formation.wood; i++) {
            this.pioche.add(new ResourceCard("Stone",TypeRessources.WOOD));
        }
        for (int i = 0; i < formation.brick; i++) {
            this.pioche.add(new ResourceCard("Stone",TypeRessources.BRICK));
        }
        for (int i = 0; i < formation.glass; i++) {
            this.pioche.add(new ResourceCard("Stone",TypeRessources.GLASS));
        }
        for (int i = 0; i < formation.scroll; i++) {
            this.pioche.add(new ResourceCard("Stone",TypeRessources.SCROLL));
        }
        for (int i = 0; i < formation.blueCat; i++) {
            this.pioche.add(new BlueCard("Femme",2));
        }
        for (int i = 0; i < formation.blue3; i++) {
            this.pioche.add(new BlueCard("Homme",3));
        }
        for (int i = 0; i < formation.wheel; i++) {
            this.pioche.add(new ScienceCard("Wheel"));
        }
        for (int i = 0; i < formation.compass; i++) {
            this.pioche.add(new ScienceCard("Compass"));
        }
        for (int i = 0; i < formation.tablet; i++) {
            this.pioche.add(new ScienceCard("Tablet"));
        }
        for (int i = 0; i < formation.war; i++) {
            this.pioche.add(new MilitaryCard("bouclier0",0));
        }
        for (int i = 0; i < formation.warDouble; i++) {
            this.pioche.add(new MilitaryCard("bouclier2",2));
        }
        for (int i = 0; i < formation.warSingle; i++) {
            this.pioche.add(new MilitaryCard("bouclier1",1));
        }
    }


    /*public Pioche(){
        this.pioche= new ArrayList<>();

        this.pioche.add(new BlueCard("Homme2",3));
        this.pioche.add(new BlueCard("Homme3",3));
        this.pioche.add(new BlueCard("Homme4",3));
        this.pioche.add(new BlueCard("Femme1",2));
        this.pioche.add(new BlueCard("Femme2",2));
        this.pioche.add(new BlueCard("Femme3",3));
        this.pioche.add(new BlueCard("Femme4",3));
        this.pioche.add(new BlueCard("Femme5",3));
        this.pioche.add(new BlueCard("Femme6",3));
        this.pioche.add(new BlueCard("Femme7",3));
        this.pioche.add(new BlueCard("Femme8",3));
        this.pioche.add(new ResourceCard("Gold1"));
        this.pioche.add(new ResourceCard("Gold2"));
        this.pioche.add(new ResourceCard("Gold3"));
        this.pioche.add(new ResourceCard("Gold4"));
        this.pioche.add(new ResourceCard("Gold5"));
        this.pioche.add(new ResourceCard("Gold6"));
        this.pioche.add(new ResourceCard("Pierre1"));
        this.pioche.add(new ResourceCard("Pierre2"));
        this.pioche.add(new ResourceCard("Pierre3"));
        this.pioche.add(new ResourceCard("Pierre4"));
        this.pioche.add(new ResourceCard("Brick1"));
        this.pioche.add(new ResourceCard("Brick2"));
        this.pioche.add(new ResourceCard("Brick3"));
        this.pioche.add(new ResourceCard("Brick4"));
        this.pioche.add(new ResourceCard("Bois1"));
        this.pioche.add(new ResourceCard("Bois2"));
        this.pioche.add(new ResourceCard("Bois3"));
        this.pioche.add(new ResourceCard("Bois4"));
        this.pioche.add(new ResourceCard("Verre1"));
        this.pioche.add(new ResourceCard("Verre2"));
        this.pioche.add(new ResourceCard("Verre3"));
        this.pioche.add(new ResourceCard("Verre4"));
        this.pioche.add(new ResourceCard("Parchemin1"));
        this.pioche.add(new ResourceCard("Parchemin2"));
        this.pioche.add(new ResourceCard("Parchemin3"));
        this.pioche.add(new ResourceCard("Parchemin4"));
        this.pioche.add(new ScienceCard("Roue1"));
        this.pioche.add(new ScienceCard("Roue2"));
        this.pioche.add(new ScienceCard("Roue3"));
        this.pioche.add(new ScienceCard("Roue4"));
        this.pioche.add(new ScienceCard("Compas1"));
        this.pioche.add(new ScienceCard("Compas2"));
        this.pioche.add(new ScienceCard("Compas3"));
        this.pioche.add(new ScienceCard("Compas4"));
        this.pioche.add(new ScienceCard("Tablette1"));
        this.pioche.add(new ScienceCard("Tablette2"));
        this.pioche.add(new ScienceCard("Tablette3"));
        this.pioche.add(new ScienceCard("Tablette4"));
        this.pioche.add(new MilitaryCard("bouclier0corne1",0));
        this.pioche.add(new MilitaryCard("bouclier0corne2",0));
        this.pioche.add(new MilitaryCard("bouclier0corne3",0));
        this.pioche.add(new MilitaryCard("bouclier0corne4",0));
        this.pioche.add(new MilitaryCard("bouclier1corne1",1));
        this.pioche.add(new MilitaryCard("bouclier1corne2",1));
        this.pioche.add(new MilitaryCard("bouclier1corne3",1));
        this.pioche.add(new MilitaryCard("bouclier1corne4",1));
        this.pioche.add(new MilitaryCard("bouclier2corne1",2));
        this.pioche.add(new MilitaryCard("bouclier2corne2",2));
    }*/

    public Card getCard() {
        if (pioche.isEmpty())
            initPioche();
        return pioche.remove(0);
    }


    public void setPioche(List<Card> pioche) {
        this.pioche = pioche;
    }

}







