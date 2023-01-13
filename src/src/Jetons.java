public abstract class Jetons {
    private boolean Jeton;
    private String type;
    private int score;
    public Jetons(){}
    public Jetons(boolean jeton, String type, int score){
        this.Jeton = jeton;
        this.type = type;
        this.score = score;
    }

    public boolean isJeton() {
        return this.Jeton;
    }
    public void setJeton(boolean jeton) {
        this.Jeton = jeton;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
