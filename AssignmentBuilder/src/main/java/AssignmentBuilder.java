public class AssignmentBuilder {
    private String title;
    private String description;
    private String deadline;

    public AssignmentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public AssignmentBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public AssignmentBuilder setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    public Assignment build() {
        return new Assignment(title, description, deadline);
    }
}
