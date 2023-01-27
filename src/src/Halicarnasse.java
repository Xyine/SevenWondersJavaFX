public class Halicarnasse extends Wonder{
    Halicarnasse(int nEtage,int maxnEtage, EnumCartes formation){
        super(nEtage,maxnEtage,formation, formation.name());
        numberEtageConstruit = 0;
    }

    @Override
    public void effetSpecial() {

    }
}
