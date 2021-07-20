package pl.sylwar.Kapi.model;

public class Task {
    private Long id;
    private String name;
    private String description;
    private Long priorityId;
    private Long statusId;
    private Long userId;
    private Long workerId;

    public Task(Long id, String name, String description, Long priorityId, Long statusId, Long userId, Long workerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priorityId = priorityId;
        this.statusId = statusId;
        this.userId = userId;
        this.workerId = workerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }
}
