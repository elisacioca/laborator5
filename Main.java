package p1;

import java.util.Vector;

public class Main {
    public static void main(String[] args){

        User user = new User("aa",  "aa",  "aa",  "0000000000",  "suka",  "alalal");

        Item item1 = new Item(25,1025);
        Item item2 = new Item(35,7777);

        Pachet pachet1 = new Pachet();
        Vector<Item> v= new Vector<Item>();
        v.add(item1);
        v.add(item2);

        pachet1.addItem(v);


    }
}
