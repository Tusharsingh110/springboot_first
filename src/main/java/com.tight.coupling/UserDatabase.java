package com.tight.coupling;

public class UserDatabase {
    public String getUserDetails() {
        // Can directly access database from here.
        return "User Details from the Database.";
    }
}
