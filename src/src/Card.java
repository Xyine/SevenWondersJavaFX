public abstract class Card {
    private String Type;
    private int Score;
    private int CNumber;
    private String Color;
    private String Effect;
    private String Place;
    private  String name;

    public Card(String name){
        this.name = name;
    }

    public Card(String Type, int Score, int CNumber, String Color, String Effect, String Place) {
        this.Type = Type;
        this.Score = Score;
        this.Color = Color;
        this.Effect = Effect;
        this.Place = Place;
        this.CNumber = CNumber;
    }

    public String getType() {
        return Type;
    }
    public void setType (String Type){
        this.Type = Type;
    }
    public int getCNumber() {
        return CNumber;
    }
    public void setCNumber (int CNumber){
        this.CNumber = CNumber;
    }
    public String getColor() {
        return Color;
    }
    public void setColor (String Color){
        this.Color = Color;
    }
    public String getEffect() {
        return Effect;
    }
    public void setEffect (String Effect){
        this.Effect = Effect;
    }
    public String getPlace() {
        return Place;
    }
    public void setPlace (String Place){
        this.Place = Place;
    }

    public abstract void play();
}
