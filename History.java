package p1;
import java.util.Vector;

public class History {

    private Vector<Comanda> myComanda;
    public User myUser;
    public static History onlyOne;

    private static History instance = null;
    protected History() {
            // Exists only to defeat instantiation.
    }

    public static History getInstance() {
            if(instance == null) {
                instance = new History();

            }
            return instance;
    }


    public void remove(Comanda x){
        for(Comanda i : myComanda)
            if(i.getID() == x.getID())
                myComanda.remove(i);

    }


    public void listallComenzi(){

        for(Comanda i : myComanda)
            System.out.println(i.getID());

    }

    public void listcomanda(int index){
        System.out.println();
    }

    public void detaliiComanda(int index){

    }

}
