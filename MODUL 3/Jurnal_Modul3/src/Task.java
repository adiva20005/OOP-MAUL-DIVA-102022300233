import java.time.LocalDate;

public class Task {
    private String title;
    private String priority;
    private String status;
    
    

    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getPriority() {
        return priority;
    }



    public void setPriority(String priority) {
        this.priority = priority;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public LocalDate getDueDate() {
        return dueDate;
    }



    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;

    // TO DO: Buat constructor untuk kelas Task

    // TO DO: Buat getter untuk title

    // TO DO: Buat getter untuk priority

    // TO DO: Buat getter untuk dueDate

    // TO DO: Buat getter untuk status
    
    // TO DO: Buat setter untuk status
    
}
