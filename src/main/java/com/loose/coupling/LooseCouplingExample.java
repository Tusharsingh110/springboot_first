package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider =  new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
    }
}
