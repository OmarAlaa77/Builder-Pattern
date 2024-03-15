public class Assignment {
    private String title;
    private String description;
    private String deadline;

    public Assignment(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
