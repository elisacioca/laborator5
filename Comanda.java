import java.util.Vector;

public class Comanda {

  private String dataPlasare;

  private String dataLivrare;

  private int ID;

  private String curier;

  private int pretTotal;

  private Vector<Pachet>  myPachet;
  private History myHistory;

  public void newOperation() {
  }

  public String getDataPlasare() {
    return dataPlasare;
  }

  public void setDataPlasare(String dataPlasare) {
    this.dataPlasare = dataPlasare;
  }

  public String getDataLivrare() {
    return dataLivrare;
  }

  public void setDataLivrare(String dataLivrare) {
    this.dataLivrare = dataLivrare;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getCurier() {
    return curier;
  }

  public void setCurier(String curier) {
    this.curier = curier;
  }

  public int getPretTotal() {
    return pretTotal;
  }

  public void setPretTotal(int pretTotal) {
    this.pretTotal = pretTotal;
  }

  /**
 *
 * @element-type Pachet
 */
  public Vector getMyPachet() {
    return myPachet;
  }

  public void setMyPachet(Vector myPachet) {
    this.myPachet = myPachet;
  }
  public void add(Pachet pachet){
    this.myPachet.add(pachet);
  }
}