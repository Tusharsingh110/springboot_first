package com.loose.coupling;

public class UserManager {
//    private final UserDatabaseProvider userDatabase = new UserDatabaseProvider();
        private final UserDataProvider userDataProvider;

        public UserManager(UserDataProvider userDataProvider) {
            this.userDataProvider = userDataProvider;
        }

        public String getUserInfo() {
            return userDataProvider.getUserDetails();
        }
}
