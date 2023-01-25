package com.resourcemanagement.apamanagement.model;

import java.util.Set;

public class RepresentativeDTO {
    private String representativeName;
    private Long phoneNumber;
    private String emailId;
    private String flatNumber;
    private String wingName;
    private String apartmentName;
    private Set<Task> tasks;

    public RepresentativeDTO(String representativeName, Long phoneNumber, String emailId, String flatNumber, String wingName, String apartmentName, Set<Task> tasks) {
        this.representativeName = representativeName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.flatNumber = flatNumber;
        this.wingName = wingName;
        this.apartmentName = apartmentName;
        this.tasks = tasks;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
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
}
