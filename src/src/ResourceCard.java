
public class ResourceCard extends Card {


    private  TypeRessources type;
    public ResourceCard(String name,TypeRessources type) {

        super(name);
        this.type = type;


    }



    @Override
    public void play() {
        // Ajouter la ressource à la ville du joueur
    }
}