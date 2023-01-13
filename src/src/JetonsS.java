public class JetonsS extends Jetons {
    private String ability;
    public JetonsS(){}
    public JetonsS(boolean jeton, String type, int score, String ability){
        super(jeton,type,score);
        this.ability = ability;
    }
}
