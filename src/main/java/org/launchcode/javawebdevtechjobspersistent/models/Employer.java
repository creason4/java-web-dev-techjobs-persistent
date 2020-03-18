package org.launchcode.javawebdevtechjobspersistent.models;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message="Location needed longer than 3 characters")
    @Size(min=3, max=100)
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

   public Employer(@NotBlank @Size(min=3, max=100)
                 String location, List<Job> jobs){
       this.location = location;
       this.jobs = jobs;
   }

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
   }

    public void setJobs(List<Job> jobs) {
       this.jobs = jobs;
  }
//
//    @Override
//    public Collection<Object> toLowerCase() {
//        return null;
//    }
}
