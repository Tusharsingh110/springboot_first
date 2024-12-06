package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Can directly access database from here.
        return "User Details from the Database.";
    }
}
