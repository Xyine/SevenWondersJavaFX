public class JetonsVic extends Jetons{
    public JetonsVic(){}
    public JetonsVic(boolean jeton, String type, int score){
        super(jeton,type,score);
    }
    public void Play() {
        /* La toure du Player à faire la pioche */
        while (isJeton() == true){
            System.out.println("Choisir L'emplacement de la pioche");
        }
    }
}
