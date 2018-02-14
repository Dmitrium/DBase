package sample.winsecond;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sample.winfirst.DBentity;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.winfirst.FirstWindowController.conn;

public class SecondWindowController implements Initializable {

    @FXML
    private TableView<DBentity> table;
    @FXML
    private TableColumn<DBentity, String> t1;
    @FXML
    private TableColumn<DBentity, String> t2;
    @FXML
    private TableColumn<DBentity, String> t3;
    @FXML
    private TableColumn<DBentity, String> t4;

    @FXML
    private TableColumn<DBentity, String> t5;

    @FXML
    private TableColumn<DBentity, String> t6;

    @FXML
    private TableColumn<DBentity, String> t7;

    @FXML
    private TableColumn<DBentity, String> t8;

    @FXML
    private TableColumn<DBentity, String> t9;

    @FXML
    private TableColumn<DBentity, String> t10;

    @FXML
    private TableColumn<DBentity, String> t11;

    @FXML
    private TableColumn<DBentity, String> t12;

    @FXML
    private TableColumn<DBentity, String> t13;

    @FXML
    private TableColumn<DBentity, String> t14;

    @FXML
    private TableColumn<DBentity, String> t15;

    @FXML
    private TableColumn<DBentity, String> t16;

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
    private ImageView minimize;

    @FXML
    private ImageView exit;

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

    @FXML
    private ImageView maxWind;

    @FXML
    private TextArea textfieldGUID;

    @FXML
    private AnchorPane blackPane;

    private ObservableList<DBentity> data;
    private ResultSet rs;
    private Statement statement;
    static Desktop desk;
    static DBentity forchange;
    static boolean t = false;
    double initialX;
    double initialY;
    static File file;
    static File[] listfiles;
    Properties property = new Properties();
    Pattern p1;
    Pattern p2;
    Pattern p3;
    Pattern p4;
    private static String forReplace;
    @FXML
    void backup(ActionEvent event) throws IOException {    //Бэкап базы данных
        String dbUserName="root";
        String dbPassword="root";
        String dbName="nd_database";
        String path=property.getProperty("pathToDump");
        InputStream stream = new FileInputStream("src\\main\\resources\\config.properties");
        property.load(new InputStreamReader(stream,"UTF-8"));
        String executeCmd = property.getProperty("mysqldumpPath")+" -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r " + path;
        Process runtimeProcess;
        try
        {
            System.out.println(executeCmd);//this out put works in mysql shell
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0)
            {
                System.out.println("Backup created successfully");
            }
            else
            {
                System.out.println("Could not create the backup");
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @FXML
    void mousePressed(MouseEvent event) {       //определение координат окна. Используется для mouseDragged
        initialX = event.getSceneX();
        initialY = event.getSceneY();
    }
    @FXML
    void mouseDragged(MouseEvent event) {      //перемещение окна
        blackPane.getScene().getWindow().setX( event.getScreenX() - initialX);
        blackPane.getScene().getWindow().setY( event.getScreenY() - initialY);
    }
    @FXML
    void buttonGUID(ActionEvent event) throws SQLException {          //Поиск по GUID
        ObservableList<CharSequence> str = textfieldGUID.getParagraphs();
        data = FXCollections.observableArrayList();
        for (CharSequence s: str) {
            System.out.println(s);
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table WHERE GUID='"+s.toString()+"'");
            while (rs.next()) {
                data.add(new DBentity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }
        tableInit();
        table.setItems(null);
        table.setItems(data);
    }
    @FXML
    void delete(ActionEvent event) throws SQLException {           //кнопка удалить запись
        ObservableList<DBentity> pr, all;
        all = table.getItems();
        pr = table.getSelectionModel().getSelectedItems();
        statement = conn.createStatement();
        DBentity us = table.getItems().get(table.getSelectionModel().getSelectedIndex());
        String dl = "DELETE FROM nd_database.table WHERE Год = '"+us.getYear()+"' AND GUID = '"+us.getGUID()+"' AND Ф = '"+us.getFilial()+"' AND П = '"+us.getPredpr()+"' AND Маг = '"+us.getMagistral()+"' AND Начало = '"+us.getBegin()+"' AND Конец = '"+us.getEnd()+"' AND Подучастки = '"+us.getPoduchastok()+"' AND Диаметр = '"+us.getDiametr()+"' AND Длина = '"+
                us.getLength()+"' AND `Год ввода в эксплуатацию/перекладка` = '"+us.getYearOFekspluat()+"' AND Прокладка = '"+us.getProkladka()+"' AND Состояние = '"+us.getStatus()+"' AND Примечание = '"+us.getPrimechanie()+
                "' AND `Дата сдачи` = '"+us.getDataSdachi()+"' AND `Ответственное лицо` = '"+us.getOtvetLico()+"';";
        statement.executeUpdate(dl);
        pr.forEach(all::remove);
        statement.close();
    }
    @FXML
    void change(ActionEvent event) throws SQLException {           //кнопка изменить запись
        statement = conn.createStatement();
        String ch = "UPDATE nd_database.table SET Год = '"+aaa111.getText()+"', GUID = '"+a211.getText()+"', Ф = '"+a311.getText()+"', П = '"+a411.getText()+"', Маг = '"+a511.getText()+"', Начало = '"+a611.getText()+"', Конец = '"+a711.getText()+"', Подучастки = '"+a811.getText()+"', Диаметр = '"+a911.getText()+"', Длина = '"+
                a1011.getText()+"', `Год ввода в эксплуатацию/перекладка` = '"+a1111.getText()+"', Прокладка = '"+a1211.getText()+"', Состояние = '"+a1311.getText()+"', Примечание = '"+a1411.getText()+
                "', `Дата сдачи` = '"+a1511.getText()+"', `Ответственное лицо` = '"+a1611.getText()+"' WHERE Год = '"+forchange.getYear()+"' AND GUID = '"+forchange.getGUID()+"' AND Ф = '"+forchange.getFilial()+"' AND П = '"+forchange.getPredpr()+"' AND Маг = '"+forchange.getMagistral()+"' AND Начало = '"+forchange.getBegin()+"' AND Конец = '"+forchange.getEnd()+"' AND Подучастки = '"+forchange.getPoduchastok()+"' AND Диаметр = '"+forchange.getDiametr()+"' AND Длина = '"+
                forchange.getLength()+"' AND `Год ввода в эксплуатацию/перекладка` = '"+forchange.getYearOFekspluat()+"' AND Прокладка = '"+forchange.getProkladka()+"' AND Состояние = '"+forchange.getStatus()+"' AND Примечание = '"+forchange.getPrimechanie()+
                "' AND `Дата сдачи` = '"+forchange.getDataSdachi()+"' AND `Ответственное лицо` = '"+forchange.getOtvetLico()+"';";
        statement.executeUpdate(ch);
        statement.close();
    }
    @FXML
    void addGUIDs(ActionEvent event) throws SQLException {           //кнопка добавления GUID
        ObservableList<CharSequence> str = textfieldGUID.getParagraphs();
        data = FXCollections.observableArrayList();
        statement = conn.createStatement();
        for (CharSequence s: str) {
            System.out.println(s);
            String ex = "INSERT INTO nd_database.table values('','"+s.toString()+"','','','','','','','','','','','','','','');";
            statement.executeUpdate(ex);
        }
        statement.close();
    }
    @FXML
    void add(ActionEvent event) throws SQLException {           //кнопка добавления записи
        statement = conn.createStatement();
        String ex = "INSERT INTO nd_database.table values('"+a1.getText()+"','"+a2.getText()+"','"+a3.getText()+"','"+a4.getText()+"','"+a5.getText()+"','"+a6.getText()+"','"+a7.getText()+"','"+a8.getText()+"','"+a9.getText()+"','"+a10.getText()+"','"+a11.getText()+"','"+a12.getText()+"','"+a13.getText()+"','"+a14.getText()+"','"+a15.getText()+"','"+a16.getText()+"');";
        statement.executeUpdate(ex);
    }

    @FXML
    void press(ActionEvent event) throws SQLException {            //кнопка вывести всю базу данных
        data = FXCollections.observableArrayList();
        try {
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table");
            while (rs.next()) {
                data.add(new DBentity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        tableInit();
        table.setItems(null);
        table.setItems(data);
    }

    @FXML
    void clearfilter(MouseEvent event) {
        aa11.clear();
        a21.clear();
        a31.clear();
        a41.clear();
        a51.clear();
        a61.clear();
        a71.clear();
        a81.clear();
        a91.clear();
        a101.clear();
        a111.clear();
        a121.clear();
        a131.clear();
        a141.clear();
        a151.clear();
        a161.clear();
    }

    @FXML
    void opendir(ActionEvent event) throws SQLException, IOException {          //открытие папки
        statement = conn.createStatement();
        DBentity us = table.getItems().get(table.getSelectionModel().getSelectedIndex());
        desk = Desktop.getDesktop();
        ArrayList list = new ArrayList<Pattern>();
        p1 = Pattern.compile(us.getFilial()+"$");
        p2 = Pattern.compile(us.getPredpr()+"$");
        p3 = Pattern.compile("\\s"+us.getMagistral()+"$");
        p4 = Pattern.compile("(^)"+"("+"("+us.getBegin().replace("/","[.]")+"[ - ]"+us.getEnd().replace("/","[.]")+")|"+us.getBegin().replace("к","").replace("/","[.]")+"|"+us.getBegin().replace("/","[.]")+")"+"($|\\W)");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        try{
        file = new File("\\\\pl7-bkp-03\\Общие отдела ДТ\\_РАБОТА\\АРХИВ_НД_МОЭК\\"+us.getYear());
        for (int i=0; i<list.size(); i++){
            regexOpenDir((Pattern) list.get(i));
        }
            desk.open(file);
        } catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Ошибочка! Неверное название папки", ButtonType.OK);
            alert.setTitle("Ошибка в названии папки");
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.show();}
    }

    void regexOpenDir(Pattern p){
        listfiles = file.listFiles();
        for(int i=0; i<listfiles.length; i++){
            if (listfiles[i].isDirectory()) {
                    Matcher m1 = p.matcher(listfiles[i].getName());
                    if (m1.find()) {
                        file = listfiles[i];
                    }
            }
        }
    }
    @FXML
    void minimize(MouseEvent event) {      //свернуть окно
        ((Stage)(table.getScene().getWindow())).setIconified(true);
    }
    @FXML
    void zoomedUP(MouseEvent event) {
        exit.setFitHeight(23);
        exit.setFitWidth(23);
    }
    @FXML
    void zoomedDOWN(MouseEvent event) {
        exit.setFitHeight(20);
        exit.setFitWidth(20);
    }
    @FXML
    void zoomedUPm(MouseEvent event) {
        minimize.setFitHeight(23);
        minimize.setFitWidth(23);
    }
    @FXML
    void zoomedDOWNm(MouseEvent event) {
        minimize.setFitHeight(20);
        minimize.setFitWidth(20);
    }
    @FXML
    void zoomedUPz(MouseEvent event) {
        maxWind.setFitHeight(23);
        maxWind.setFitWidth(23);
    }
    @FXML
    void zoomedDOWNz(MouseEvent event) {
        maxWind.setFitHeight(20);
        maxWind.setFitWidth(20);
    }
    @FXML
    void exit(MouseEvent event) {   //закрытие окна
        System.exit(0);
    }
    @FXML
    void zoom(MouseEvent event) throws IOException {      //изменение размера окна
        if(!t){
            maxWind.setImage(new Image("/icons/icons8-нормальный-экран-50.png"));
            ((Stage)(table.getScene().getWindow())).setMaximized(true);
        t=true;
        } else {
            ((Stage)(table.getScene().getWindow())).setMaximized(false);
            maxWind.setImage(new Image("/icons/icons8-полный-экран-50.png"));
        t=false;
        }
    }

    @FXML
    void find(ActionEvent event) throws SQLException {  //кнопка фильтра
        data = FXCollections.observableArrayList();
        try {
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table");
            while (rs.next()) {
                data.add(new DBentity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }

            if (!aa11.getText().equals("")){
                String REGEX = aa11.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getYear()).find());
            }
            if (!a21.getText().equals("")){
                String REGEX = a21.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getGUID()).find());}
            if (!a31.getText().equals("")){
                String REGEX = a31.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getFilial()).find());}
            if (!a41.getText().equals("")){
                String REGEX = a41.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getPredpr()).find());}
            if (!a51.getText().equals("")){
                String REGEX = a51.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getMagistral()).find());}
            if (!a61.getText().equals("")){
                String REGEX = a61.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getBegin()).find());}
            if (!a71.getText().equals("")){
                String REGEX = a71.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getEnd()).find());}
            if (!a81.getText().equals("")){
                String REGEX = a81.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getPoduchastok()).find());}
            if (!a91.getText().equals("")){
                String REGEX = a91.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getDiametr()).find());}
            if (!a101.getText().equals("")){
                String REGEX = a101.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getLength()).find());}
            if (!a111.getText().equals("")){
                String REGEX = a111.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getYearOFekspluat()).find());}
            if (!a121.getText().equals("")){
                String REGEX = a121.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getProkladka()).find());}
            if (!a131.getText().equals("")){
                String REGEX = a131.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getStatus()).find());}
            if (!a141.getText().equals("")){
                String REGEX = a141.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getPrimechanie()).find());}
            if (!a151.getText().equals("")){
                String REGEX = a151.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getDataSdachi()).find());}
            if (!a161.getText().equals("")){
                String REGEX = a161.getText();
                Pattern p = Pattern.compile(REGEX);
                data.removeIf(x -> !p.matcher(x.getOtvetLico()).find());}
        tableInit();
            table.setItems(null);
            table.setItems(data);
            table.setEditable(true);
    }

    public void tableInit(){               //просто метод инициализирующий столбцы
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
        try{                    //бд сразу выводится в таблицу при открытии окна
        data = FXCollections.observableArrayList();
        try {
            rs = conn.createStatement().executeQuery("SELECT * FROM nd_database.table");
            while (rs.next()) {
                data.add(new DBentity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
            tableInit();
        table.setItems(null);
        table.setItems(data);} catch (Exception e){                //окно ошибки
            Alert alert = new Alert(Alert.AlertType.ERROR, "Ошибочка! Неверные Логин или Пароль", ButtonType.OK);
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.setTitle("Ошибка подключения к базе данных");
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.showAndWait();
            System.exit(0);
        }

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
        try {
            property.load(new FileInputStream("src\\main\\resources\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}