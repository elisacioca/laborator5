import java.util.Vector;

public class User {

  private int ID;
  private String username;
  private String address;
  private String telefon;
  private String password;
  private String nume;
  private String prenume;
  private History myHistory;

  User(String username, String password, String address, String telefon, String nume, String prenume) {
	  this.username = username;
	  this.password = password;
	  this.address = address;
	  this.telefon = telefon;
	  this.nume = nume;
	  this.prenume = prenume;
  }
  
  public void newCommand() {
	  Vector<Item> i;
	  Pachet p = new Pachet();
	  p.addItem(i);
	  Comanda c = new Comanda();
	  c.add(p);
  }

  public void cancelCommand(Comanda c) {
	 myHistory.remove(c);
  }
  
  public int getID() {
	  return this.ID;
  }
  public void setID(int ID) {
	  this.ID = ID;
  }
  public String getUsername() {
	  return this.username;
  }
  public void setUsername(String user) {
	  this.username = user;
  }
  
  public String getAddress() {
	  return this.address;
  }
  public void setAddress(String address) {
	  this.address = address;
  }
  
  public String getTelefon() {
	  return this.telefon;
  }
  public void setTelefon(String telefon) {
	  this.telefon = telefon;
  }
  
  public String getPassword() {
	  return this.password;
  }
  public void setPassword(String password) {
	  this.password = password;
  }
  
  public String getNume() {
	  return this.nume;
  }
  public void setNume(String nume) {
	  this.nume = nume;
  }
  
  public String getPrenume() {
	  return this.prenume;
  }
  public void setPrenume(String prenume) {
	  this.prenume = prenume;
  }
  
  public History getMyHistory() {
	return myHistory;
  }
  public void setMyHistory(History myHistory) {
	this.myHistory = myHistory;
  }
}