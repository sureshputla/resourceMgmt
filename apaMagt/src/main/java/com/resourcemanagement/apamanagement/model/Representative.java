package com.resourcemanagement.apamanagement.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "representatives")
public class Representative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "representative_id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String representativeName;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "wing_name")
    private String wingName;

    @Column(name = "apartment_name")
    private String apartmentName;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Task> tasks;

    public Representative() {
    }

    public Representative(RepresentativeDTO representativeDTO) {
        this.representativeName = representativeDTO.getRepresentativeName();
        this.phoneNumber = representativeDTO.getPhoneNumber();
        this.emailId = representativeDTO.getEmailId();
        this.flatNumber = representativeDTO.getFlatNumber();
        this.wingName = representativeDTO.getWingName();
        this.apartmentName = representativeDTO.getApartmentName();
        this.tasks = representativeDTO.getTasks();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getWingName() {
        return wingName;
    }

    public void setWingName(String wingName) {
        this.wingName = wingName;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Representative{" +
                "representativeName='" + representativeName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", wingName='" + wingName + '\'' +
                ", apartmentName='" + apartmentName + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
