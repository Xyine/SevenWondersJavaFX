public class Babylone extends Wonder{
    Babylone(int nEtage,int maxnEtage, EnumCartes formation){
        super(nEtage,maxnEtage,formation, formation.name());
        numberEtageConstruit = 0;
    }



    @Override
    public void effetSpecial() {

    }
}
