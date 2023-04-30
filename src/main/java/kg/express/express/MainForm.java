package kg.express.express;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
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
    private Tab tabFindAnalyse = new Tab();

    @FXML
    private Tab tabRegistrator = new Tab();

    @FXML
    private Tab patientDataTab = new Tab();

    @FXML
    private TableView<RegPatient> registrationTable;

    @FXML
    private TableColumn<RegPatient, Integer> codeReg;

    @FXML
    private TableColumn<RegPatient, String> fioReg;

    @FXML
    private TableColumn<RegPatient, String> purposeReg;

    @FXML
    private TableColumn<RegPatient, String> dateReg;

    @FXML
    private TableColumn<RegPatient, String> resultReg;

    @FXML
    private TableColumn<RegPatient, String> genderReg;

    @FXML
    private TableColumn<RegPatient, String> sumReg;

    @FXML
    private TableColumn<RegPatient, String> commentReg;

    List<RegPatient> regPatientList = List.of(
            new RegPatient(1, "Иванов Иван Иванович", "Для консультации", "2022-01-01", "Ожидает", "Мужской", "1000", "Комментарий 1"),
            new RegPatient(2, "Петрова Ольга Сергеевна", "Для осмотра", "2022-01-02", "Выполнено", "Женский", "2000", "Комментарий 2"),
            new RegPatient(3, "Сидоров Василий Петрович", "Для анализов", "2022-01-03", "Отменено", "Мужской", "1500", "Комментарий 3"),
            new RegPatient(4, "Кузнецова Анна Ивановна", "Для консультации", "2022-01-04", "Ожидает", "Женский", "1000", "Комментарий 4"),
            new RegPatient(5, "Смирнов Сергей Петрович", "Для осмотра", "2022-01-05", "Выполнено", "Мужской", "2000", "Комментарий 5"),
            new RegPatient(6, "Николаева Екатерина Владимировна", "Для анализов", "2022-01-06", "Ожидает", "Женский", "1500", "Комментарий 6"),
            new RegPatient(7, "Козлов Дмитрий Александрович", "Для консультации", "2022-01-07", "Отменено", "Мужской", "1000", "Комментарий 7"),
            new RegPatient(8, "Белова Анастасия Олеговна", "Для осмотра", "2022-01-08", "Выполнено", "Женский", "2000", "Комментарий 8"),
            new RegPatient(9, "Шестаков Виктор Иванович", "Для анализов", "2022-01-09", "Ожидает", "Мужской", "1500", "Комментарий 9"),
            new RegPatient(10, "Федорова Екатерина Александровна", "Для консультации", "2022-01-10", "Отменено", "Женский", "1000", "Комментарий 10")
    );

    @FXML
    private TextField findPatientButton;

    @FXML
    private Tab addPatientRegTab;

    @FXML
    private TabPane registratorDataTabPane;

    @FXML
    private Tab analyseRegTab;

    @FXML
    private Button reloadRegButton;

    @FXML
    private TableView<AppointmentDoctor> appointmentDoctorTable;

    List<AppointmentDoctor> appointmentDoctorList = List.of(
            new AppointmentDoctor(1, "Иванов Иван Иванович", "01.05.2023", "10:00", "Петров Петр Петрович", "М", "01.01.1990"),
            new AppointmentDoctor(2, "Петров Петр Петрович", "02.05.2023", "11:00", "Иванов Иван Иванович", "М", "01.01.1985"),
            new AppointmentDoctor(3, "Сидоров Сидор Сидорович", "03.05.2023", "12:00", "Кузнецова Елена Петровна", "Ж", "01.01.1975"),
            new AppointmentDoctor(4, "Кузнецова Елена Петровна", "04.05.2023", "13:00", "Сидоров Сидор Сидорович", "Ж", "01.01.1980"),
            new AppointmentDoctor(5, "Петрова Анна Ивановна", "05.05.2023", "14:00", "Иванова Мария Петровна", "Ж", "01.01.1995"),
            new AppointmentDoctor(6, "Иванова Мария Петровна", "06.05.2023", "15:00", "Петрова Анна Ивановна", "Ж", "01.01.2000"),
            new AppointmentDoctor(7, "Сергеев Сергей Сергеевич", "07.05.2023", "16:00", "Антонов Иван Иванович", "М", "01.01.1978"),
            new AppointmentDoctor(8, "Антонов Иван Иванович", "08.05.2023", "17:00", "Сергеев Сергей Сергеевич", "М", "01.01.1965"),
            new AppointmentDoctor(9, "Федоров Федор Федорович", "09.05.2023", "18:00", "Сидоров Сидор Сидорович", "М", "01.01.1950"),
            new AppointmentDoctor(10, "Кузьмин Сергей Петрович", "10.05.2023", "19:00", "Петрова Анна Ивановна", "М", "01.01.1988")
    );

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntBirthday;

    @FXML
    private TableColumn<AppointmentDoctor, Integer> aptntCode;

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntDate;

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntFio;

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntGender;

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntPatient;

    @FXML
    private TableColumn<AppointmentDoctor, String> aptntTime;

    @FXML
    private Tab appointmentDoctorTab;

    @FXML
    private MenuBar mainMenuBar;

    @FXML
    private Button appointmentDoctorFindButton;

    @FXML
    private MenuItem reloadAppButton;

    @FXML
    private Button appointmentDoctorSearchButton;

    @FXML
    private TextField appointmentDoctorSearch;

    @FXML
    private Button reloadAppointmentDoctorButton;

    @FXML
    private TableView<?> analyseRegTable;

    @FXML
    private Tab storeTab;

    @FXML
    private TabPane MainTabPane;

    @FXML
    private Tab diagramTab;

    @FXML
    private PieChart pieChartDiagram;

    @FXML
    void initialize() {

        reloadAppButton.setOnAction(actionEvent -> {
            try {
                Stage stage = (Stage) reloadAppButton.getParentPopup().getOwnerWindow();
                HelloApplication app = new HelloApplication();
                app.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        tabRegistrator.setOnSelectionChanged(event -> {
            if (tabFindAnalyse.isSelected()) {

            }
        });

        // Первое вхождение
        if(tabRegistrator.isSelected() && patientDataTab.isSelected()){
            registrationAddAllInfo();

            reloadRegButton.setOnAction(actionEvent -> {
                registrationTable.setItems(FXCollections.observableList(regPatientList));
            });

            System.out.println("tabRegistrator patientDataTab");
            registratorPatiantDataFindButton.setOnAction(actionEvent -> {
                registrationSearchButton();
                System.out.println("button tabRegistrator patientDataTab");
            });

            ContextMenu contextMenu = new ContextMenu();
            MenuItem menuItem1 = new MenuItem("Результат анализа (ru)");
            MenuItem menuItem2 = new MenuItem("Результат анализа (без шапки)");
            MenuItem menuItem3 = new MenuItem("Регистрационный билет (ru)");
            MenuItem menuItem4 = new MenuItem("Отправить на почту");
            SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
            contextMenu.getItems().addAll(menuItem1, menuItem2, menuItem3, separatorMenuItem, menuItem4);

            registrationTable.setOnMouseClicked(event2 -> {
                if (event2.getButton() == MouseButton.SECONDARY) {
                    contextMenu.show(registrationTable, event2.getScreenX(), event2.getScreenY());
                }
            });
        }

        analyseRegTab.setOnSelectionChanged(event -> {
            if(analyseRegTab.isSelected()){
                ContextMenu contextMenu = new ContextMenu();
                MenuItem menuItem1 = new MenuItem("Закрепить принимающего врача");
                MenuItem menuItem2 = new MenuItem("Удалить принимающего врача");
                contextMenu.getItems().addAll(menuItem1, menuItem2);

                analyseRegTable.setOnMouseClicked(event1 -> {
                    if (event1.getButton() == MouseButton.SECONDARY) {
                        contextMenu.show(registrationTable, event1.getScreenX(), event1.getScreenY());
                    }
                });
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

        // Если его выбрали
        patientDataTab.setOnSelectionChanged(event1 ->  {
            if(patientDataTab.isSelected()){
                registrationAddAllInfo();
                System.out.println("YES2");
                registratorPatiantDataFindButton.setOnAction(actionEvent -> {
                    registrationSearchButton();
                    System.out.println("Button find");
                });

                reloadRegButton.setOnAction(actionEvent -> {
                    registrationTable.setItems(FXCollections.observableList(regPatientList));
                });

                ContextMenu contextMenu = new ContextMenu();
                MenuItem menuItem1 = new MenuItem("Результат анализа (ru)");
                MenuItem menuItem2 = new MenuItem("Результат анализа (без шапки)");
                MenuItem menuItem3 = new MenuItem("Регистрационный билет (ru)");
                MenuItem menuItem4 = new MenuItem("Отправить на почту");
                SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
                contextMenu.getItems().addAll(menuItem1, menuItem2, menuItem3, separatorMenuItem, menuItem4);

                registrationTable.setOnMouseClicked(event2 -> {
                    if (event2.getButton() == MouseButton.SECONDARY) {
                        contextMenu.show(registrationTable, event2.getScreenX(), event2.getScreenY());
                    }
                });
            }
        });

        // Найти анализы
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

                findAnalyseTable.setOnMouseClicked(event3 -> {
                    ContextMenu contextMenu = new ContextMenu();
                    SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem1 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem2 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem3 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem4 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem5 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem6 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem7 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem8 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem9 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem10 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem11 = new SeparatorMenuItem();
                    SeparatorMenuItem separatorMenuItem12 = new SeparatorMenuItem();
                    MenuItem menuItem1 = new MenuItem("Результат анализа (ru)");
                    MenuItem menuItem2 = new MenuItem("Результат анализа на русском выборочно");
                    MenuItem menuItem3 = new MenuItem("Результат диагностики выборочно");
                    MenuItem menuItem4 = new MenuItem("Регистрационный билет");
                    MenuItem menuItem5 = new MenuItem("Установить комментарий");
                    MenuItem menuItem6 = new MenuItem("Отправить на почту");
                    MenuItem menuItem7 = new MenuItem("Обновить ФИО пациента");
                    MenuItem menuItem8 = new MenuItem("История заказа");
                    MenuItem menuItem9 = new MenuItem("Закрепить напр. врача");
                    MenuItem menuItem10 = new MenuItem("Закрепить принимающего врача");
                    MenuItem menuItem11 = new MenuItem("Повторить анализ");
                    MenuItem menuItem12 = new MenuItem("Не отправлен БМ");
                    MenuItem menuItem13 = new MenuItem("Отправлен БМ");
                    MenuItem menuItem14 = new MenuItem("Перезабор");
                    MenuItem menuItem15 = new MenuItem("Выбраковка анализа");
                    MenuItem menuItem16 = new MenuItem("Установить ККМ");
                    MenuItem menuItem17 = new MenuItem("Снять ККМ");
                    MenuItem menuItem18 = new MenuItem("Результат анализа (без шапки)");
                    MenuItem menuItem19 = new MenuItem("Результат анализа на английском (без шапки)");
                    contextMenu.getItems().addAll(menuItem1, menuItem2, menuItem3, separatorMenuItem, menuItem4,
                            separatorMenuItem1, menuItem5, separatorMenuItem2, menuItem6,separatorMenuItem3,
                            menuItem7, separatorMenuItem4, menuItem8, separatorMenuItem5, menuItem9, separatorMenuItem6,
                            menuItem10, separatorMenuItem7, menuItem11, separatorMenuItem8, menuItem12, menuItem13,
                            separatorMenuItem9, menuItem14, separatorMenuItem10, menuItem15, separatorMenuItem11,
                            menuItem16, menuItem17, separatorMenuItem12, menuItem18, menuItem19);

                    findAnalyseTable.setOnMouseClicked(event1 -> {
                        if (event1.getButton() == MouseButton.SECONDARY) {
                            contextMenu.show(findAnalyseTable, event1.getScreenX(), event1.getScreenY());
                        }
                    });
                });
            }
        });


        appointmentDoctorFindButton.setOnAction(actionEvent -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("doctorappointmentfind.fxml"));
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

        // Запись к врачу
        appointmentDoctorTab.setOnSelectionChanged(event -> {
            if(appointmentDoctorTab.isSelected()){
                aptntCode.setCellValueFactory(new PropertyValueFactory<>("code"));
                aptntFio.setCellValueFactory(new PropertyValueFactory<>("fio"));
                aptntDate.setCellValueFactory(new PropertyValueFactory<>("date"));
                aptntTime.setCellValueFactory(new PropertyValueFactory<>("time"));
                aptntPatient.setCellValueFactory(new PropertyValueFactory<>("patient"));
                aptntGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
                aptntBirthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));

                appointmentDoctorTable.setItems(FXCollections.observableList(appointmentDoctorList));

                appointmentDoctorSearchButton.setOnAction(actionEvent -> {
                    for(int i=0; i<appointmentDoctorList.size(); i++){
                        if(appointmentDoctorSearch.getText().equals(String.valueOf(appointmentDoctorList.get(i).getCode()))){
                            AppointmentDoctor appointmentDoctor = appointmentDoctorList.get(i);
                            ObservableList<AppointmentDoctor> appointmentDoctorObservableList = FXCollections.observableArrayList();
                            appointmentDoctorObservableList.add(appointmentDoctor);
                            appointmentDoctorTable.setItems(appointmentDoctorObservableList);
                            break;
                        }
                    }
                });

                reloadAppointmentDoctorButton.setOnAction(actionEvent -> {
                    appointmentDoctorTable.setItems(FXCollections.observableList(appointmentDoctorList));
                });
            }
        });

        diagramTab.setOnSelectionChanged(event -> {
            if(diagramTab.isSelected()){
                int maleCount=0, femaleCount=0;
                for(int i=0; i<findAnalyseList.size(); i++){
                    if(findAnalyseList.get(i).getGender().equals("Мужской")){
                        maleCount++;
                    } else {
                        femaleCount++;
                    }
                }
                ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                        new PieChart.Data("Мужчины", maleCount),
                        new PieChart.Data("Женщины", femaleCount)
                );
                pieChartDiagram.setData(pieChartData);
                pieChartDiagram.setLabelsVisible(true);
                pieChartDiagram.setLegendVisible(true);
            }
            pieChartDiagram.setLabelLineLength(15);
            pieChartDiagram.getData().forEach(data -> {
                String label = String.format("%d", Math.round(data.getPieValue()));
                data.setName(data.getName() + ": " + label);
            });
        });
    }

    private void registrationSearchButton() {
        for(int i=0; i<regPatientList.size(); i++){
            if(findPatientButton.getText().equals(String.valueOf(regPatientList.get(i).getCodeReg()))){
                RegPatient regPatient = regPatientList.get(i);
                ObservableList<RegPatient> foundList = FXCollections.observableArrayList();
                foundList.add(regPatient);
                registrationTable.setItems(foundList);
                break;
            }
        }
    }

    private void registrationAddAllInfo() {
        codeReg.setCellValueFactory(new PropertyValueFactory<>("codeReg"));
        fioReg.setCellValueFactory(new PropertyValueFactory<>("fioReg"));
        purposeReg.setCellValueFactory(new PropertyValueFactory<>("purposeReg"));
        dateReg.setCellValueFactory(new PropertyValueFactory<>("dateReg"));
        resultReg.setCellValueFactory(new PropertyValueFactory<>("resultReg"));
        genderReg.setCellValueFactory(new PropertyValueFactory<>("gender"));
        sumReg.setCellValueFactory(new PropertyValueFactory<>("sumReg"));
        commentReg.setCellValueFactory(new PropertyValueFactory<>("commentReg"));
        registrationTable.setItems(FXCollections.observableList(regPatientList));
    }

}