import java.util.Vector;

public class Pachet {

  protected int status;

  protected Vector<Item> produse;

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

  public Pachet(Vector<Item> produse) {
    this.status = 0;
    this.produse = produse;
    this.pretPachet = pretPachet;
    this.ID = ID;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Vector<Item> getProduse() {
    return produse;
  }

  public void setProduse(Vector<Item> produse) {
    produse = produse;
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