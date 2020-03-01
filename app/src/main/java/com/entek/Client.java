package com.entek;

public class Client {
    private String name, email, phoneNumber, comment;
    private boolean soliciting, residential;

    Client(String name, String email, String phoneNumber, String comment, boolean soliciting,
           boolean residential) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.soliciting = soliciting;
        this.residential = residential;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    String getPhoneNumber() {
        return phoneNumber;
    }
    String getComment() {
        return comment;
    }
    boolean getSoliciting() {
        return soliciting;
    }
    public boolean getResidential() {
        return residential;
    }
    public String toString() {
        String a = name + ", " + email + ", " + phoneNumber + ", " + comment;
        if (soliciting) a += ", is soliciting";
        if (!residential) a += ", commercial";
        return a;
    }
}
