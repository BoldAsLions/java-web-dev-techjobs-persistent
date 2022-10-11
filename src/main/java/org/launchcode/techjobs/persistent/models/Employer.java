package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Employer extends AbstractEntity {
    @NotNull(message = "Location is required!")
    @Size(min=1,max=75,message="Location must be between 1 - 75 characters long")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(String location){
        this.location = location;
    }
    public Employer(){}
    public String getLocation() {
        return location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
