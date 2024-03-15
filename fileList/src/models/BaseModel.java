package models;
import java.time.LocalTime;


public abstract class BaseModel {
    private int id;
    private LocalTime createdAt;
    private LocalTime updatedAt;
    private String createdBy;
    private String updatedBy;

    protected BaseModel(){}
    protected BaseModel(int id, String createdBy, String updatedBy,LocalTime createdAt, LocalTime updatedAt) {
        this.id=id;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }


}
