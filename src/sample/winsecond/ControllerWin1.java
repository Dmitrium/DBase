package sample.winsecond;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.NumberStringConverter;
import sample.winfirst.User;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.ResourceBundle;

import static sample.winfirst.Controller.conn;

public class ControllerWin1 implements Initializable {


    @FXML
    private TableView<User> table;
    @FXML
    private TableColumn<User, String> t1;
    @FXML
    private TableColumn<User, String> t2;
    @FXML
    private TableColumn<User, String> t3;
    @FXML
    private TableColumn<User, String> t4;

    @FXML
    private TableColumn<User, String> t5;

    @FXML
    private TableColumn<User, String> t6;

    @FXML
    private TableColumn<User, String> t7;

    @FXML
    private TableColumn<User, String> t8;

    @FXML
    private TableColumn<User, String> t9;

    @FXML
    private TableColumn<User, String> t10;

    @FXML
    private TableColumn<User, String> t11;

    @FXML
    private TableColumn<User, String> t12;

    @FXML
    private TableColumn<User, String> t13;

    @FXML
    private TableColumn<User, String> t14;

    @FXML
    private TableColumn<User, String> t15;

    @FXML
    private TableColumn<User, String> t16;

    @FXML
    private TextField a1;

    @FXML
    private TextField a2;

    @FXML
    private TextField a3;

    @FXML
    private TextField a4;

    @FXML
    private TextField a5;

    @FXML
    private TextField a6;

    @FXML
    private TextField a7;

    @FXML
    private TextField a8;

    @FXML
    private TextField a9;

    @FXML
    private TextField a10;

    @FXML
    private TextField a11;

    @FXML
    private TextField a12;

    @FXML
    private TextField a13;

    @FXML
    private TextField a14;

    @FXML
    private TextField a15;

    @FXML
    private TextField a16;

    @FXML
    private Button btn;

    @FXML
    private Button butop;

    @FXML
    private Button addbut;

    @FXML
    private TextField a21;

    @FXML
    private TextField a31;

    @FXML
    private TextField a41;

    @FXML
    private TextField a51;

    @FXML
    private TextField a61;

    @FXML
    private TextField a71;

    @FXML
    private TextField a81;

    @FXML
    private TextField a91;

    @FXML
    private TextField a101;

    @FXML
    private TextField a111;

    @FXML
    private TextField aa11;

    @FXML
    private TextField a121;

    @FXML
    private TextField a131;

    @FXML
    private TextField a141;

    @FXML
    private TextField a151;

    @FXML
    private TextField a161;

    @FXML
    private Button fnd;

    @FXML
    private TextField aaa111;

    @FXML
    private TextField a211;

    @FXML
    private TextField a311;

    @FXML
    private TextField a411;

    @FXML
    private TextField a511;

    @FXML
    private TextField a611;

    @FXML
    private TextField a711;

    @FXML
    private TextField a811;

    @FXML
    private TextField a911;

    @FXML
    private TextField a1011;

    @FXML
    private TextField a1111;

    @FXML
    private TextField a1211;

    @FXML
    private TextField a1311;

    @FXML
    private TextField a1411;

    @FXML
    private TextField a1511;

    @FXML
    private TextField a1611;

    private ObservableList<User> data;

    private ResultSet rs;

    private Statement statement;

    static Desktop desk;
    static User forchange;


    @FXML
    void delete(ActionEvent event) throws SQLException {

ObservableList<User> pr, all;
all = table.getItems();
pr = table.getSelectionModel().getSelectedItems();
statement = conn.createStatement();
User us = table.getItems().get(table.getSelectionModel().getSelectedIndex());
        String dl = "DELETE FROM nd_database.table WHERE Год = '"+us.getYear()+"' AND GUID = '"+us.getGUID()+"' AND Ф = '"+us.getFilial()+"' AND П = '"+us.getPredpr()+"' AND Маг = '"+us.getMagistral()+"' AND Начало = '"+us.getBegin()+"' AND Конец = '"+us.getEnd()+"' AND Подучастки = '"+us.getPoduchastok()+"' AND Диаметр = '"+us.getDiametr()+"' AND Длина = '"+
                us.getLength()+"' AND `Год ввода в эксплуатацию/перекладка` = '"+us.getYearOFekspluat()+"' AND Прокладка = '"+us.getProkladka()+"' AND Состояние = '"+us.getStatus()+"' AND Примечание = '"+us.getPrimechanie()+
                "' AND `Дата сдачи` = '"+us.getDataSdachi()+"' AND `Ответственное лицо` = '"+us.getOtvetLico()+"';";
        statement.executeUpdate(dl);
        pr.forEach(all::remove);
        statement.close();
    }


    @FXML
    void change(ActionEvent event) throws SQLException {
        statement = conn.createStatement();
        String ch = "UPDATE nd_database.table SET Год = '"+aaa111.getText()+"', GUID = '"+a211.getText()+"', Ф = '"+a311.getText()+"', П = '"+a411.getText()+"', Маг = '"+a511.getText()+"', Начало = '"+a611.getText()+"', Конец = '"+a711.getText()+"', Подучастки = '"+a811.getText()+"', Диаметр = '"+a911.getText()+"', Длина = '"+
                a1011.getText()+"', `Год ввода в эксплуатацию/перекладка` = '"+a1111.getText()+"', Прокладка = '"+a1211.getText()+"', Состояние = '"+a1311.getText()+"', Примечание = '"+a1411.getText()+
                "', `Дата сдачи` = '"+a1511.getText()+"', `Ответственное лицо` = '"+a1611.getText()+"' WHERE Год = '"+forchange.getYear()+"' AND GUID = '"+forchange.getGUID()+"' AND Ф = '"+forchange.getFilial()+"' AND П = '"+forchange.getPredpr()+"' AND Маг = '"+forchange.getMagistral()+"' AND Начало = '"+forchange.getBegin()+"' AND Конец = '"+forchange.getEnd()+"' AND Подучастки = '"+forchange.getPoduchastok()+"' AND Диаметр = '"+forchange.getDiametr()+"' AND Длина = '"+
                forchange.getLength()+"' AND `Год ввода в эксплуатацию/перекладка` = '"+forchange.getYearOFekspluat()+"' AND Прокладка = '"+forchange.getProkladka()+"' AND Состояние = '"+forchange.getStatus()+"' AND Примечание = '"+forchange.getPrimechanie()+
                "' AND `Дата сдачи` = '"+forchange.getDataSdachi()+"' AND `Ответственное лицо` = '"+forchange.getOtvetLico()+"';";
        statement.executeUpdate(ch);
    }


    @FXML
    void add(ActionEvent event) throws SQLException {
        statement = conn.createStatement();
        String ex = "INSERT INTO nd_database.table values('"+a1.getText()+"','"+a2.getText()+"','"+a3.getText()+"','"+a4.getText()+"','"+a5.getText()+"','"+a6.getText()+"','"+a7.getText()+"','"+a8.getText()+"','"+a9.getText()+"','"+a10.getText()+"','"+a11.getText()+"','"+a12.getText()+"','"+a13.getText()+"','"+a14.getText()+"','"+a15.getText()+"','"+a16.getText()+"');";
        statement.executeUpdate(ex);
    }






    @FXML
    void press(ActionEvent event) throws SQLException {
            data = FXCollections.observableArrayList();
            try {
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table");
            while (rs.next()) {
                data.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
         table();
        table.setItems(null);
        table.setItems(data);
    }



    @FXML
    void opendir(ActionEvent event) throws SQLException, IOException {          //открытие папки
        statement = conn.createStatement();
        User us = table.getItems().get(table.getSelectionModel().getSelectedIndex());
        File fi = null;
        desk = Desktop.getDesktop();
        if(us.getMagistral()!=("")){
        fi = new File("\\\\pl7-bkp-03\\Общие отдела ДТ\\_РАБОТА\\"+us.getYear()+"\\_НД\\1. Проекты\\3. ПАО МОЭК, г. Москва\\4. Рабочие материалы\\3. Обработка данных\\Филиал №"+us.getFilial()+"\\Предприятие №"+us.getPredpr()+"\\Магистраль "+us.getMagistral());
        desk.open(fi);
        } else {
            fi = new File("\\\\pl7-bkp-03\\Общие отдела ДТ\\_РАБОТА\\"+us.getYear()+"\\_НД\\1. Проекты\\3. ПАО МОЭК, г. Москва\\4. Рабочие материалы\\3. Обработка данных\\Филиал №"+us.getFilial()+"\\Предприятие №"+us.getPredpr());
            desk.open(fi);
        }
    }




    @FXML
    void find(ActionEvent event) throws SQLException {

        data = FXCollections.observableArrayList();
        try {
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table");
            while (rs.next()) {
                data.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        if (!aa11.getText().equals("")){
            data.removeIf(x -> !x.getYear().equals(aa11.getText()));}
        if (!a21.getText().equals("")){
            data.removeIf(x -> !x.getGUID().equals(a21.getText()));}
        if (!a31.getText().equals("")){
            data.removeIf(x -> !x.getFilial().equals(a31.getText()));}
        if (!a41.getText().equals("")){
            data.removeIf(x -> !x.getPredpr().equals(a41.getText()));}
        if (!a51.getText().equals("")){
            data.removeIf(x -> !x.getMagistral().equals(a51.getText()));}
        if (!a61.getText().equals("")){
            data.removeIf(x -> !x.getBegin().equals(a61.getText()));}
        if (!a71.getText().equals("")){
            data.removeIf(x -> !x.getEnd().equals(a71.getText()));}
        if (!a81.getText().equals("")){
            data.removeIf(x -> !x.getPoduchastok().equals(a81.getText()));}
        if (!a91.getText().equals("")){
            data.removeIf(x -> !x.getDiametr().equals(a91.getText()));}
        if (!a101.getText().equals("")){
            data.removeIf(x -> !x.getLength().equals(a101.getText()));}
        if (!a111.getText().equals("")){
            data.removeIf(x -> !x.getYearOFekspluat().equals(a111.getText()));}
        if (!a121.getText().equals("")){
            data.removeIf(x -> !x.getProkladka().equals(a121.getText()));}
        if (!a131.getText().equals("")){
            data.removeIf(x -> !x.getStatus().equals(a131.getText()));}
        if (!a141.getText().equals("")){
            data.removeIf(x -> !x.getPrimechanie().equals(a141.getText()));}
        if (!a151.getText().equals("")){
            data.removeIf(x -> !x.getDataSdachi().equals(a151.getText()));}
        if (!a161.getText().equals("")){
            data.removeIf(x -> !x.getOtvetLico().equals(a161.getText()));}
         table();
            table.setItems(null);
            table.setItems(data);
            table.setEditable(true);
    }




    public void table(){
        TableColumn[] tarray = new TableColumn[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16};
        for (int i=0; i<16; i++)
            tarray[i].setCellFactory(TextFieldTableCell.forTableColumn());
        t1.setCellValueFactory(new PropertyValueFactory<>("year"));
        t2.setCellValueFactory(new PropertyValueFactory<>("GUID"));
        t3.setCellValueFactory(new PropertyValueFactory<>("filial"));
        t4.setCellValueFactory(new PropertyValueFactory<>("predpr"));
        t5.setCellValueFactory(new PropertyValueFactory<>("magistral"));
        t6.setCellValueFactory(new PropertyValueFactory<>("begin"));
        t7.setCellValueFactory(new PropertyValueFactory<>("end"));
        t8.setCellValueFactory(new PropertyValueFactory<>("poduchastok"));
        t9.setCellValueFactory(new PropertyValueFactory<>("diametr"));
        t10.setCellValueFactory(new PropertyValueFactory<>("length"));
        t11.setCellValueFactory(new PropertyValueFactory<>("yearOFekspluat"));
        t12.setCellValueFactory(new PropertyValueFactory<>("prokladka"));
        t13.setCellValueFactory(new PropertyValueFactory<>("status"));
        t14.setCellValueFactory(new PropertyValueFactory<>("primechanie"));
        t15.setCellValueFactory(new PropertyValueFactory<>("dataSdachi"));
        t16.setCellValueFactory(new PropertyValueFactory<>("otvetLico"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        table.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                try{
                forchange = table.getItems().get(table.getSelectionModel().getSelectedIndex());
                aaa111.setText(forchange.getYear());
                a211.setText(forchange.getGUID());
                a311.setText(forchange.getFilial());
                a411.setText(forchange.getPredpr());
                a511.setText(forchange.getMagistral());
                a611.setText(forchange.getBegin());
                a711.setText(forchange.getEnd());
                a811.setText(forchange.getPoduchastok());
                a911.setText(forchange.getDiametr());
                a1011.setText(forchange.getLength());
                a1111.setText(forchange.getYearOFekspluat());
                a1211.setText(forchange.getProkladka());
                a1311.setText(forchange.getStatus());
                a1411.setText(forchange.getPrimechanie());
                a1511.setText(forchange.getDataSdachi());
                a1611.setText(forchange.getOtvetLico());} catch (Exception e) {}
            }}
        );
     table.getSelectionModel().setCellSelectionEnabled(true);
    }


}