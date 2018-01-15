package sample.winsecond;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
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

    private ObservableList<User> data;

    private ResultSet rs;

    private Statement statement;

    static Desktop desk;


    @FXML
    void delete(ActionEvent event) throws SQLException {

ObservableList<User> pr, all;
TablePosition<User, String> tb;
all = table.getItems();
pr = table.getSelectionModel().getSelectedItems();
statement = conn.createStatement();
User us = table.getItems().get(table.getSelectionModel().getSelectedIndex());

        String dl = "DELETE FROM nd_database.table WHERE Год= '"+us.getYear()+"' AND GUID = '"+us.getGUID()+"' AND Ф = '"+us.getFilial()+"' AND П = '"+us.getPredpr()+"' AND Маг = '"+us.getMagistral()+"' AND Начало = '"+us.getBegin()+"' AND Конец = '"+us.getEnd()+"' AND Подучастки = '"+us.getPoduchastok()+"' AND Диаметр = '"+us.getDiametr()+"' AND Длина = '"+
                us.getLength()+"' AND `Год ввода в эксплуатацию/перекладка` = '"+us.getYearOFekspluat()+"' AND Прокладка = '"+us.getProkladka()+"' AND Состояние = '"+us.getStatus()+"' AND Примечание = '"+us.getPrimechanie()+
                "' AND `Дата сдачи` = '"+us.getDataSdachi()+"' AND `Ответственное лицо` = '"+us.getOtvetLico()+"';";
        statement.executeUpdate(dl);
       pr.forEach(all::remove);
       statement.close();
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

        table.setEditable(true);

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

        if (!a11.getText().equals("")){
            data.removeIf(x -> !x.getYear().equals(a11.getText()));}
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
            table.setItems(null);
            table.setItems(data);






    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
     table.getSelectionModel().setCellSelectionEnabled(true);
     t1.setEditable(true);
    }


}