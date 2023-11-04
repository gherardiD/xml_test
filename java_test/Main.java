package java_test;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Main implements Serializable {

  public static void main(String[] args) {
    ArrayList<Record> records = new ArrayList<Record>();

    // scrittura su XML da oggetto
    writeXML(records);

    // lettura da XML in oggetto
    // readXML(records);

    // stampa oggetto
    for (Record record : records) {
      System.out.println(record);
    }
  }

  private static void writeXML(ArrayList<Record> records) {
    try {
      XMLEncoder encoder = new XMLEncoder(
          new BufferedOutputStream(new FileOutputStream(
              "C:\\Users\\gherardi.19032\\Desktop\\tep\\xml\\test\\xml_test\\xml\\lombardiaWrite.xml")));
      records = new ArrayList<Record>();
      records.add(new Record(197290732, "struttura", new Data("comune", "sedrina")), new Data("provincia", "bergamo"),
          new Data("denominazione_struttura", "casa di riposo"), new Data("categoria", "casa di riposo"));
      records.add(new Record(197290265, "struttura", new Data("comune", "sedrina")), new Data("provincia", "bergamo"),
          new Data("denominazione_struttura", "casa di riposo"), new Data("categoria", "casa di riposo"));
      records.add(new Record(308067537, "struttura", new Data("comune", "sedrina")), new Data("provincia", "bergamo"),
          new Data("denominazione_struttura", "casa di riposo"), new Data("categoria", "casa di riposo"));
      records.add(new Record(388905103, "struttura", new Data("comune", "sedrina")), new Data("provincia", "bergamo"),
          new Data("denominazione_struttura", "casa di riposo"), new Data("categoria", "casa di riposo"));
      encoder.writeObject(records);
      encoder.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private static void readXML(ArrayList<Record> records) {
    try {
      XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(
          new FileInputStream(
              "C:\\Users\\gherardi.19032\\Desktop\\tep\\xml\\test\\xml_test\\xml\\lombardia copy.xml")));
      records = (ArrayList<Record>) decoder.readObject();
      decoder.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}