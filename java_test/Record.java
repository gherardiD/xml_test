package java_test;

public class Record {
  protected int id;
  protected String name;
  protected Data comune
  protected Data provincia
  protected Data denominazione_struttura
  protected Data categoria

  // public static final long serialVersionUID = 40L;
  public Record() {
    id = 0;
    name = "";
    comune = new Data();
    provincia = new Data();
    denominazione_struttura = new Data();
    categoria = new Data();
  }

  public Record(int id, String name, Data data) {
    setId(id);
    setName(name);
    setData();
  }

  public void setData(Data data) {
    this.data = data;
  }

  public Data getData() {
    return data;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return getName() + " " + getId();
  }
}
