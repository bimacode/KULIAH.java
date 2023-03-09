package Percobaan2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.cell.TextFieldTableCell;

public class SoalB  extends Application {

    static String nama[] = new String[10];
    static String nim[] = new String[10];
    static String email[] = new String[10];
    static String fakultas[] = new String[10];
    static String jurusan[] = new String[10];
    static String alamat[] = new String[10];
    static String kota[] = new String[10];

    private TableView<bio> table = new TableView<>();
    private ObservableList<bio> data;



    @Override
    public void start(Stage primaryStage) throws Exception {

        data = FXCollections.observableArrayList(
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a]),
                new bio(nama[bio.a], nim[bio.a], email[bio.a], fakultas[bio.a], jurusan[bio.a], alamat[bio.a], kota[bio.a])
        );

        primaryStage.setTitle("Modul 6");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 25, 25, 25));

        Text sceneTitle = new Text("Selamat Datang");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("Username:");
        grid.add(userName, 0, 1);

        TextField username = new TextField();
        grid.add(username, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn1 = new Button("Masuk");
        Button btn2 = new Button("Keluar");
        HBox hbBtn = new HBox(10);

        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn1);
        hbBtn.getChildren().add(btn2);

        grid.add(hbBtn, 1, 4);

        Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                if(username.getText().equals("Bima")) {

                    if(pwBox.getText().equals("12345")) {

                        Group root = new Group();
                        Scene scene2 = new Scene(root, Color.DARKGREY);

                        primaryStage.setTitle("Modul 6");
                        primaryStage.setWidth(1350);
                        primaryStage.setHeight(600);

                        Label label = new Label("  ----- BIODATA MAHASISWA -----");
                        label.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 27));
                        label.setTextFill(Color.WHITE);

                        HBox hb = new HBox();

                        table.setEditable(true);

                        Label placeholder = new Label();
                        placeholder.setText("Tidak Ada Data");
                        table.setPlaceholder(placeholder);

                        TableColumn<bio, String> nama = new TableColumn<>("Nama");
                        nama.setMinWidth(300);
                        nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
                        nama.setCellFactory(TextFieldTableCell.<bio>forTableColumn());



                        TableColumn<bio, String> nim = new TableColumn<>("Nim");
                        nim.setMinWidth(250);
                        nim.setCellValueFactory(new PropertyValueFactory<>("nim"));
                        nim.setCellFactory(TextFieldTableCell.<bio>forTableColumn());


                        TableColumn<bio, String> email = new TableColumn<>("E-Mail");
                        email.setMinWidth(200);
                        email.setCellValueFactory(new PropertyValueFactory<>("email"));
                        email.setCellFactory(TextFieldTableCell.<bio>forTableColumn());



                        TableColumn<bio, String> fakultas = new TableColumn<>("Fakultas");
                        fakultas.setMinWidth(150);
                        fakultas.setCellValueFactory(new PropertyValueFactory<>("fakultas"));
                        fakultas.setCellFactory(TextFieldTableCell.<bio>forTableColumn());


                        TableColumn<bio, String> jurusan = new TableColumn<>("Jurusan");
                        jurusan.setMinWidth(130);
                        jurusan.setCellValueFactory(new PropertyValueFactory<>("jurusan"));
                        jurusan.setCellFactory(TextFieldTableCell.<bio>forTableColumn());

                        TableColumn<bio, String> alamat = new TableColumn<>("Alamat");
                        alamat.setMinWidth(130);
                        alamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
                        alamat.setCellFactory(TextFieldTableCell.<bio>forTableColumn());

                        TableColumn<bio, String> kota = new TableColumn<>("Kota");
                        kota.setMinWidth(130);
                        kota.setCellValueFactory(new PropertyValueFactory<>("kota"));
                        kota.setCellFactory(TextFieldTableCell.<bio>forTableColumn());


                        table.getColumns().addAll(nama, nim, email, fakultas, jurusan, alamat, kota);
                        table.setItems(data);


                        TextField addNama = new TextField();
                        addNama.setMaxWidth(nama.getPrefWidth());
                        addNama.setPromptText("isi nama");

                        TextField addNim = new TextField();
                        addNim.setMaxWidth(nim.getPrefWidth());
                        addNim.setPromptText("isi nim");
                        addNim.textProperty().addListener(new ChangeListener<String>() {
                            @Override
                            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                                String newValue) {
                                if (!newValue.matches("\\d*")) {
                                    addNim.setText(newValue.replaceAll("[^\\d]", ""));
                                }
                            }
                        });

                        TextField addEmail = new TextField();
                        addEmail.setMaxWidth(email.getPrefWidth());
                        addEmail.setPromptText("isi E-mail");


                        TextField addFakultas = new TextField();
                        addFakultas.setMaxWidth(fakultas.getPrefWidth());
                        addFakultas.setPromptText("isi fakultas");

                        TextField addJurusan = new TextField();
                        addJurusan.setMaxWidth(jurusan.getPrefWidth());
                        addJurusan.setPromptText("isi jurusan");

                        TextField addAlamat = new TextField();
                        addAlamat.setMaxWidth(jurusan.getPrefWidth());
                        addAlamat.setPromptText("isi alamat");

                        TextField addKota = new TextField();
                        addKota.setMaxWidth(jurusan.getPrefWidth());
                        addKota.setPromptText("isi kota");




                        Button addButton = new Button("Create");

                        addButton.setOnAction((ActionEvent r) -> {
                            String Nama = addNama.getText();
                            String Nim = addNim.getText();
                            String Email = addEmail.getText();
                            String Fakultas = addFakultas.getText();
                            String Jurusan = addJurusan.getText();
                            String Alamat = addAlamat.getText();
                            String Kota = addKota.getText();

                            if(Nama.isEmpty() || Nim.isEmpty() || Email.isEmpty()||Fakultas.isEmpty() || Jurusan.isEmpty() || Alamat.isEmpty() || Kota.isEmpty() ){
                                Alert a = new Alert(Alert.AlertType.INFORMATION, "Inputan Tidak Boleh Ada Yang Kosong");
                                a.setTitle("Alert");
                                a.showAndWait();

                            }else {

                                if (Email.contains("@webmail.umm.ac.id")) {
                                    data.add(new bio(
                                            addNama.getText(),
                                            addNim.getText(),
                                            addEmail.getText(),
                                            addFakultas.getText(),
                                            addJurusan.getText(),
                                            addAlamat.getText(),
                                            addKota.getText()
                                    ));
                                    addNama.clear();
                                    addNim.clear();
                                    addEmail.clear();
                                    addFakultas.clear();
                                    addJurusan.clear();
                                    addAlamat.clear();
                                    addKota.clear();
                                }else {
                                    Alert b = new Alert(Alert.AlertType.INFORMATION, "E-mail harus berakhiran @webmail.umm.ac.id");
                                    b.setTitle("Alert");
                                    b.showAndWait();
                                }
                            }
                            }

                        );



                        Button exitButton = new Button("Keluar");

                        exitButton.setOnAction((ActionEvent r) -> {

                            Stage stage = (Stage) exitButton.getScene().getWindow();
                            stage.close();

                        });

                        hb.getChildren().addAll(addNama, addNim, addEmail, addFakultas, addJurusan,addAlamat,addKota, addButton,  exitButton);
                        hb.setSpacing(10);

                        final VBox vbox = new VBox();
                        vbox.setAlignment(Pos.CENTER);
                        vbox.setSpacing(18);
                        vbox.setPadding(new Insets(15, 15, 15, 15));
                        vbox.getChildren().addAll(label, table, hb);

                        ((Group) scene2.getRoot()).getChildren().addAll(vbox);

                        primaryStage.setScene(scene2);
                    }

                    else {
                        System.out.println("Invalid Password!");
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Password Anda Salah!");
                    }

                }

                else {
                    System.out.println("Invalid Username!");
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Username Anda Salah!");
                }

            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                Stage stage = (Stage) btn2.getScene().getWindow();
                stage.close();
            }
        });

        Scene scene1 = new Scene(grid, 300, 275);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {


        launch(args);
    }

    public static class bio {

        private String nama;
        private String nim;
        private String email;
        private String fakultas;
        private String jurusan;
        private String alamat;
        private String kota;

        static int a = 0;

        private bio(String nama, String nim, String email, String fakultas, String jurusan, String alamat, String kota) {
            this.nama = nama;
            this.nim = nim;
            this.email = email;
            this.fakultas = fakultas;
            this.jurusan = jurusan;
            this.alamat= alamat;
            this.kota= kota;
            a++;
        }
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFakultas() {
            return fakultas;
        }

        public void setFakultas(String fakultas) {
            this.fakultas = fakultas;
        }

        public String getJurusan() {
            return jurusan;
        }

        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getKota() {
            return kota;
        }
        public void setKota(String kota) {
            this.kota = kota;
        }
    }

}
