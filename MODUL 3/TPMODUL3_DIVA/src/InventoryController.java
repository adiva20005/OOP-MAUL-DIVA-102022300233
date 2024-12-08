import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;


public class InventoryController  {

    @FXML
    private TableColumn<Album, String> albumNameColumn;

    @FXML
    private TextField albumNameField;

    @FXML
    private TableView<Album> albumTable;

    @FXML
    private TableColumn<Album, String> artistColumn;

    @FXML
    private TextField artistField;

    @FXML
    private TableColumn<Album, Integer> availableColumn;

    @FXML
    private TableColumn<Album, Integer> totalColumn;

    @FXML
    private TextField totalField;

    @FXML
    private TextField totalrentedField;
    
    private ObservableList<Album> albums = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        try {
            albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
            artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
            totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
            availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
            albumTable.setItems(albums);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void RentSelected(ActionEvent event) {
        try {
            
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                albumTable.refresh();
                showAlert(AlertType.INFORMATION, "Rental Successful", "The album '" + selectedAlbum.getAlbumName() + "' has been rented.");
            } else {
                showAlert(AlertType.WARNING, "Rental Failed", "No copies of '" + selectedAlbum.getAlbumName() + "' are currently available.");
            }
        } else {
            showAlert(AlertType.ERROR, "Rental Error", "No album selected. Please select an album to rent.");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
      private void handleHapus() {
        try {
            
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albums.remove(selectedAlbum);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album removed.");
        } else {
            showAlert(Alert.AlertType.ERROR, "Delete Error", "No album selected.");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleUpdate(ActionEvent event) {
        int index = 0;

        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int totalRented = Integer.parseInt(totalrentedField.getText());

            
            Album newAlbum = new Album(albumName, artist, total,totalRented );

            for (Album i : albums) {
                    if (i.getAlbumName() == albumName) {
                        albums.set(index, newAlbum);
                        clearFields();
                        break;
                    }
                    index++;
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan dalam input data");
            alert.setContentText("Silahkan cek data yang anda masukan");
            alert.showAndWait();
        }
    }

    @FXML
    private void handleTambah() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int totalRented = Integer.parseInt(totalrentedField.getText());

            if (albumName.isEmpty() || artist.isEmpty() || total < 0) {
                throw new IllegalArgumentException("Invalid input data.");
            }

            Album newAlbum = new Album(albumName, artist, total, totalRented);
            albums.add(newAlbum);
            clearFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album added successfully.");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", e.getMessage());
        }
    }


    private void clearFields() {
        albumNameField.clear();
        artistField.clear();
        totalField.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();}
   

}
