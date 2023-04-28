package kg.express.express;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;

public class MainForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button advancedSearchAnalyseButton;

    @FXML
    private Button findAnalyseButton;

    @FXML
    private TableView<FindAnalyse> findAnalyseTable;

    @FXML
    private TableColumn<FindAnalyse, Integer> idColumn;

    @FXML
    private TableColumn<FindAnalyse, String> fullNameColumn;

    @FXML
    private TableColumn<FindAnalyse, String> birthDateColumn;

    @FXML
    private TableColumn<FindAnalyse, String> genderColumn;

    @FXML
    private TableColumn<FindAnalyse, String> registrarColumn;

    @FXML
    private TableColumn<FindAnalyse, String> registrationDateColumn;

    @FXML
    private TableColumn<FindAnalyse, String> statusColumn;

    @FXML
    private TableColumn<FindAnalyse, String> commentColumn;

    @FXML
    private TableColumn<FindAnalyse, String> analysisColumn;

    @FXML
    private TableColumn<FindAnalyse, String> doctorColumn;

    @FXML
    private TableColumn<FindAnalyse, String> resultDateColumn;

    List<FindAnalyse> findAnalyseList = List.of(
            new FindAnalyse(1, "Иванов Иван Иванович", "01.01.1980", "Мужской", "Регистратор 1", "01.01.2023", "Завершен", "Комментарий 1", "Анализ 1", "Терапевт", "02.01.2023"),
            new FindAnalyse(2, "Петров Петр Петрович", "02.02.1981", "Мужской", "Регистратор 2", "02.01.2023", "В обработке", "Комментарий 2", "Анализ 2", "Онколог", null),
            new FindAnalyse(3, "Сидорова Анна Петровна", "03.03.1982", "Женский", "Регистратор 3", "03.01.2023", "В обработке", "Комментарий 3", "Анализ 3", "Гинеколог", null),
            new FindAnalyse(4, "Иванова Елена Ивановна", "04.04.1983", "Женский", "Регистратор 4", "04.01.2023", "В обработке", "Комментарий 4", "Анализ 4", "Гастроэнтеролог", null),
            new FindAnalyse(5, "Смирнов Сергей Викторович", "05.05.1984", "Мужской", "Регистратор 5", "05.01.2023", "В обработке", "Комментарий 5", "Анализ 5", "Кардиолог", null),
            new FindAnalyse(6, "Кузнецова Екатерина Васильевна", "06.06.1985", "Женский", "Регистратор 6", "06.01.2023", "Завершен", "Комментарий 6", "Анализ 6", "Онколог", "07.01.2023"),
            new FindAnalyse(7, "Петрова Ольга Ивановна", "07.07.1986", "Женский", "Регистратор 7", "07.01.2023", "В обработке", "Комментарий 7", "Анализ 7", "Терапевт", null),
            new FindAnalyse(8, "Иванов Алексей Андреевич", "08.08.1987", "Мужской", "Регистратор 8", "08.01.2023", "Завершен", "Комментарий 8", "Анализ 8", "Невролог", "09.01.2023"),
            new FindAnalyse(9, "Соколова АннаПетровна", "09.09.1988", "Женский", "Регистратор 9", "09.01.2023", "В обработке", "Комментарий 9", "Анализ 9", "Кардиолог", null),
            new FindAnalyse(10, "Ковалев Иван Петрович", "10.10.1989", "Мужской", "Регистратор 10", "10.01.2023", "В обработке", "Комментарий 10", "Анализ 10", "Гинеколог", null),
            new FindAnalyse(11, "Петров Андрей Игоревич", "11.11.1990", "Мужской", "Регистратор 11", "11.01.2023", "В обработке", "Комментарий 11", "Анализ 11", "Терапевт", null),
            new FindAnalyse(12, "Сидоров Иван Сергеевич", "12.12.1991", "Мужской", "Регистратор 12", "12.01.2023", "В обработке", "Комментарий 12", "Анализ 12", "Онколог", null),
            new FindAnalyse(13, "Кузнецова Наталья Владимировна", "13.01.1992", "Женский", "Регистратор 13", "13.01.2023", "В обработке", "Комментарий 13", "Анализ 13", "Кардиолог", null),
            new FindAnalyse(14, "Смирнов Виктор Сергеевич", "14.02.1993", "Мужской", "Регистратор 14", "14.01.2023", "Завершен", "Комментарий 14", "Анализ 14", "Невролог", "15.01.2023"),
            new FindAnalyse(15, "Иванова Мария Александровна", "15.03.1994", "Женский", "Регистратор 15", "15.01.2023", "В обработке", "Комментарий 15", "Анализ 15", "Гинеколог", null),
            new FindAnalyse(16, "Петров Александр Андреевич", "16.04.1995", "Мужской", "Регистратор 16", "16.01.2023", "В обработке", "Комментарий 16", "Анализ 16", "Терапевт", null),
            new FindAnalyse(17, "Сидорова Ольга Александровна", "17.05.1996", "Женский", "Регистратор 17", "17.01.2023", "В обработке", "Комментарий 17", "Анализ 17", "Кардиолог", null),
            new FindAnalyse(18, "Иванова Анна Сергеевна", "18.08.1990", "Женский", "Регистратор 18", "18.01.2023", "Завершен", "Комментарий 18", "Анализ 18", "Онколог", "19.01.2023"),
            new FindAnalyse(19, "Петров Андрей Александрович", "19.09.1991", "Мужской", "Регистратор 19", "19.01.2023", "В обработке", "Комментарий 19", "Анализ 19", "Терапевт", null),
            new FindAnalyse(20, "Сидоров Сергей Сергеевич", "20.10.1992", "Мужской", "Регистратор 20", "20.01.2023", "В обработке", "Комментарий 20", "Анализ 20", "Гинеколог", null),
            new FindAnalyse(21, "Кузнецова Анастасия Петровна", "21.11.1993", "Женский", "Регистратор 21", "21.01.2023", "В обработке", "Комментарий 21", "Анализ 21", "Кардиолог", null),
            new FindAnalyse(22, "Петрова Екатерина Сергеевна", "22.12.1994", "Женский", "Регистратор 22", "22.01.2023", "Завершен", "Комментарий 22", "Анализ 22", "Невролог", "23.01.2023"),
            new FindAnalyse(23, "Иванов Илья Алексеевич", "23.01.1995", "Мужской", "Регистратор 23", "23.01.2023", "Завершен", "Комментарий 23", "Анализ 23", "Онколог", "24.01.2023"),
            new FindAnalyse(24, "Смирнова Анастасия Игоревна", "24.02.1996", "Женский", "Регистратор 24", "24.01.2023", "В обработке", "Комментарий 24", "Анализ 24", "Терапевт", null),
            new FindAnalyse(25, "Кузнецов Иван Иванович", "25.03.1997", "Мужской", "Регистратор 25", "25.01.2023", "Завершен", "Комментарий 25", "Анализ 25", "Гинеколог", "26.01.2023")
            );

    @FXML
    private TextField findAnalyseText;

    @FXML
    private TreeView<String> registratorPationDataTree;

    @FXML
    private Button registratorPatiantDataFindButton;

    @FXML
    private MenuItem itemtext;

    @FXML
    private Button reloadAnalyseButton;

    @FXML
    private MenuButton menuItem;

    @FXML
    private Tab tabFindAnalyse;

    @FXML
    private Tab tabRegistrator;

    @FXML
    private Tab patientDataTab;

    @FXML
    private TabPane registratorDataTabPane;

    @FXML
    void initialize() {

        tabRegistrator.setOnSelectionChanged(event -> {
            if (tabFindAnalyse.isSelected()) {
                System.out.println("YES1");
            }
        });

        TreeItem<String> treeRoot = new TreeItem<>("Даты");
        TreeItem<String> chapter1 = new TreeItem<>("28.04.2023");
        TreeItem<String> chapter2 = new TreeItem<>("29.04.2023");
        TreeItem<String> chapter3 = new TreeItem<>("30.04.2023");

        TreeItem<String> part11 = new TreeItem<>("28.04.2023 08:20");
        TreeItem<String> part12 = new TreeItem<>("28.04.2023 08:30");
        TreeItem<String> part13 = new TreeItem<>("28.04.2023 08:40");

        TreeItem<String> part21 = new TreeItem<>("29.04.2023 09:00");
        TreeItem<String> part22 = new TreeItem<>("29.04.2023 09:10");
        TreeItem<String> part23 = new TreeItem<>("29.04.2023 09:20");

        TreeItem<String> part31 = new TreeItem<>("30.04.2023 08:35");
        TreeItem<String> part32 = new TreeItem<>("30.04.2023 09:15");
        TreeItem<String> part33 = new TreeItem<>("30.04.2023 09:25");

        chapter1.getChildren().addAll(part11, part12, part13);
        chapter2.getChildren().addAll(part21, part22, part23);
        chapter3.getChildren().addAll(part31, part32, part33);

        treeRoot.getChildren().addAll(chapter1, chapter2, chapter3);
        registratorPationDataTree.setRoot(treeRoot);

        patientDataTab.setOnSelectionChanged(event1 ->  {
            if(patientDataTab.isSelected()){
                System.out.println("YES2");
                registratorPatiantDataFindButton.setOnAction(actionEvent -> {
                    System.out.println("Button find");
                });
            }
        });


        tabFindAnalyse.setOnSelectionChanged(event -> {
            if (tabFindAnalyse.isSelected()) {

                idColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
                fullNameColumn.setCellValueFactory(new PropertyValueFactory<>("fio"));
                birthDateColumn.setCellValueFactory(new PropertyValueFactory<>("birthday"));
                genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
                registrarColumn.setCellValueFactory(new PropertyValueFactory<>("registrator"));
                registrationDateColumn.setCellValueFactory(new PropertyValueFactory<>("dateRegistration"));
                statusColumn.setCellValueFactory(new PropertyValueFactory<>("statusDocument"));
                commentColumn.setCellValueFactory(new PropertyValueFactory<>("comment"));
                analysisColumn.setCellValueFactory(new PropertyValueFactory<>("analyse"));
                doctorColumn.setCellValueFactory(new PropertyValueFactory<>("appointmentDoctor"));
                resultDateColumn.setCellValueFactory(new PropertyValueFactory<>("dateResult"));

                findAnalyseTable.setItems(FXCollections.observableList(findAnalyseList));


                advancedSearchAnalyseButton.setOnAction(buttonEvent -> {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("findanalysform.fxml"));
                    try {
                        loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("Express+");
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                });

                findAnalyseButton.setOnAction(actionEvent -> {
//                    findAnalyseText.getText()
                    for(int i=0; i<findAnalyseList.size(); i++){
                        if (findAnalyseText.getText().equals(String.valueOf(findAnalyseList.get(i).getCode()))){
                            FindAnalyse foundAnalyse = findAnalyseList.get(i);
                            ObservableList<FindAnalyse> foundList = FXCollections.observableArrayList();
                            foundList.add(foundAnalyse);
                            findAnalyseTable.setItems(foundList);
                            break;
                        }
                    }
                });

                reloadAnalyseButton.setOnAction(actionEvent -> {
                    findAnalyseTable.setItems(FXCollections.observableList(findAnalyseList));
                });
            }
        });
    }

}
