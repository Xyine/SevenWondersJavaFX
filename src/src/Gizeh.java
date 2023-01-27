public class Gizeh extends Wonder{
    Gizeh(int nEtage,int maxnEtage, EnumCartes formation){
        super(nEtage,maxnEtage,formation, formation.name());
        numberEtageConstruit = 0;
    }

    @Override
    public void effetSpecial() {

    }
}
