import java.util.Objects;
import java.util.Vector;

public class Item {

  private int pret;

  private int ID;

  public Item(int pret, int ID) {
    this.pret = pret;
    this.ID = ID;
  }

  public int getPret() {
    return pret;
  }

  public void setPret(int pret) {
    this.pret = pret;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item)) return false;
    Item item = (Item) o;
    return pret == item.pret &&
            ID == item.ID;
  }


}