public class Olympie extends Wonder{
    Olympie(int nEtage,int maxnEtage, EnumCartes formation){
        super(nEtage,maxnEtage,formation, formation.name());
        numberEtageConstruit = 0;
    }

    @Override
    public void effetSpecial() {

    }
}
