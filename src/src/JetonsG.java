public class JetonsG extends Jetons{
    private int numberJetons;
    public JetonsG(){}
    public JetonsG(boolean jeton, String type, int score, int numberJetons){
        super(jeton,type,score);
        this.numberJetons = numberJetons;
    }

    public int getNumberJetons() {
        return this.numberJetons;
    }
    public void setNumberJetons(int numberJetons) {
        this.numberJetons = numberJetons;
    }

    public void guerre(){
        if(getType().equals("Jetons de guerre")){

        }
        if(getType().equals("Jetons ")){
            if(numberJetons == 6){
                System.out.println("guerre déclanchée");

            }
        }

    }

}
