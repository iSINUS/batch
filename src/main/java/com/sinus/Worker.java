package com.sinus;

/**
 * Created by sinus on 16.02.16.
 */
public class Worker extends Person {
    private String jobTitle;

    public Worker() {
    }

    public Worker(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString()+", position: "+jobTitle;
    }
}
