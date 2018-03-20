import java.util.Vector;

public class Pachet {

  protected int status;

  protected Vector<Item> Produse;

  private int pretPachet;

  private int ID;

  public void getStatus() {

    switch (status) {
      case 0:
        System.out.println("preluare depozit");
      case 1:
        System.out.println("in drum spre Iasi");
      case 2:
        System.out.println("livrare client");
      case 3:
        System.out.println("incheiere");
    }

  }

  public Pachet(int status, Vector<Item> produse, int pretPachet, int ID, Vector myItem) {
    this.status = status;
    Produse = produse;
    this.pretPachet = pretPachet;
    this.ID = ID;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Vector<Item> getProduse() {
    return Produse;
  }

  public void setProduse(Vector<Item> produse) {
    Produse = produse;
  }

  public int getPretPachet() {
    return pretPachet;
  }

  public void setPretPachet(int pretPachet) {
    this.pretPachet = pretPachet;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

}