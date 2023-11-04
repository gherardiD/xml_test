package java_test;

public class Data {
  // protected Record record;
  protected String name;
  protected String value;
  protected String comune;
  protected String provincia;
  protected String denominazione_struttura;
  protected String categoria;

  // public Data() {
  // name = "";
  // comune = "";
  // provincia = "";
  // denominazione_struttura = "";
  // categoria = "";
  // }

  // public Data(String comune, String provincia, String denominazione_struttura,
  // String categoria) {
  // setComune(comune);
  // setProvincia(provincia);
  // setDenominazione_struttura(denominazione_struttura);
  // setCategoria(categoria);
  // }

  public Data() {
    setName("");
    setValue("");
  }

  public Data(String name, String value) {
    setName(name);
    setValue(value);
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // public String getComune() {
  // return comune;
  // }

  // public void setComune(String comune) {
  // this.comune = comune;
  // }

  // public String getProvincia() {
  // return provincia;
  // }

  // public void setProvincia(String provincia) {
  // this.provincia = provincia;
  // }

  // public String getDenominazione_struttura() {
  // return denominazione_struttura;
  // }

  // public void setDenominazione_struttura(String denominazione_struttura) {
  // this.denominazione_struttura = denominazione_struttura;
  // }

  // public String getCategoria() {
  // return categoria;
  // }

  // public void setCategoria(String categoria) {
  // this.categoria = categoria;
  // }

  // public String toString() {
  // return getComune() + " " + getProvincia() + " " +
  // getDenominazione_struttura() + " " + getCategoria();
  // }

}
