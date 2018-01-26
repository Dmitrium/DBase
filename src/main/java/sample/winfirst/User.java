package sample.winfirst;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by d.zharenkov on 27.12.2017.
 */
public class User {
    private final StringProperty year;
    private final StringProperty GUID;
    private final StringProperty filial;
    private final StringProperty predpr;
    private final StringProperty magistral;
    private final StringProperty begin;
    private final StringProperty end;
    private final StringProperty poduchastok;
    private final StringProperty diametr;
    private final StringProperty length;
    private final StringProperty yearOFekspluat;
    private final StringProperty prokladka;
    private final StringProperty status;
    private final StringProperty primechanie;
    private final StringProperty dataSdachi;
    private final StringProperty otvetLico;



    public User(String year, String GUID, String filial, String predpr, String magistral, String begin, String end, String poduchastok, String diametr, String length, String yearOFekspluat, String prokladka, String status, String primechanie, String dataSdachi, String otvetLico){

        this.year = new SimpleStringProperty(year);
        this.GUID = new SimpleStringProperty(GUID);
        this.filial = new SimpleStringProperty(filial);
        this.predpr = new SimpleStringProperty(predpr);
        this.magistral = new SimpleStringProperty(magistral);
        this.begin = new SimpleStringProperty(begin);
        this.end = new SimpleStringProperty(end);
        this.poduchastok = new SimpleStringProperty(poduchastok);
        this.diametr = new SimpleStringProperty(diametr);
        this.length = new SimpleStringProperty(length);
        this.yearOFekspluat = new SimpleStringProperty(yearOFekspluat);
        this.prokladka = new SimpleStringProperty(prokladka);
        this.status = new SimpleStringProperty(status);
        this.primechanie = new SimpleStringProperty(primechanie);
        this.dataSdachi = new SimpleStringProperty(dataSdachi);
        this.otvetLico = new SimpleStringProperty(otvetLico);
    }


    public String getYear() {
        return year.get();
    }

    public void setYear(String year) {
        this.year.set(year);
    }

    public String getFilial() {
        return filial.get();
    }

    public void setFilial(String filial) {
        this.filial.set(filial);
    }

    public String getPoduchastok() {
        return poduchastok.get();
    }

    public StringProperty poduchastokProperty() {
        return poduchastok;
    }

    public void setPoduchastok(String poduchastok) {
        this.poduchastok.set(poduchastok);
    }

    public String getDiametr() {
        return diametr.get();
    }

    public StringProperty diametrProperty() {
        return diametr;
    }

    public void setDiametr(String diametr) {
        this.diametr.set(diametr);
    }

    public String getLength() {
        return length.get();
    }

    public StringProperty lengthProperty() {
        return length;
    }

    public void setLength(String length) {
        this.length.set(length);
    }

    public String getYearOFekspluat() {
        return yearOFekspluat.get();
    }

    public StringProperty yearOFekspluatProperty() {
        return yearOFekspluat;
    }

    public void setYearOFekspluat(String yearOFekspluat) {
        this.yearOFekspluat.set(yearOFekspluat);
    }

    public String getProkladka() {
        return prokladka.get();
    }

    public StringProperty prokladkaProperty() {
        return prokladka;
    }

    public void setProkladka(String prokladka) {
        this.prokladka.set(prokladka);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getPrimechanie() {
        return primechanie.get();
    }

    public StringProperty primechanieProperty() {
        return primechanie;
    }

    public void setPrimechanie(String primechanie) {
        this.primechanie.set(primechanie);
    }

    public String getDataSdachi() {
        return dataSdachi.get();
    }

    public StringProperty dataSdachiProperty() {
        return dataSdachi;
    }

    public void setDataSdachi(String dataSdachi) {
        this.dataSdachi.set(dataSdachi);
    }

    public String getOtvetLico() {
        return otvetLico.get();
    }

    public StringProperty otvetLicoProperty() {
        return otvetLico;
    }

    public void setOtvetLico(String otvetLico) {
        this.otvetLico.set(otvetLico);
    }

    public String getBegin() {
        return begin.get();
    }

    public StringProperty beginProperty() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin.set(begin);
    }

    public String getEnd() {
        return end.get();
    }

    public StringProperty endProperty() {
        return end;
    }

    public void setEnd(String end) {
        this.end.set(end);
    }

    public String getMagistral() {
        return magistral.get();
    }

    public StringProperty magistralProperty() {
        return magistral;
    }

    public void setMagistral(String magistral) {
        this.magistral.set(magistral);
    }

    public String getPredpr() {
        return predpr.get();
    }

    public StringProperty predprProperty() {
        return predpr;
    }

    public void setPredpr(String predpr) {
        this.predpr.set(predpr);
    }
    public String getyear() {
        return year.get();
    }

    public StringProperty yearProperty() {
        return year;
    }

    public String getGUID() {
        return GUID.get();
    }

    public StringProperty GUIDProperty() {
        return GUID;
    }

    public String getfilial() {
        return filial.get();
    }

    public StringProperty filialProperty() {
        return filial;
    }


    public void setyear(String year) {
        this.year.set(year);
    }

    public void setGUID(String GUID) {
        this.GUID.set(GUID);
    }

    public void setfilial(String filial) {
        this.filial.set(filial);
    }
}
