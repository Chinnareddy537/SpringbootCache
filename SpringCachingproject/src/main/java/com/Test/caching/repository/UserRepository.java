package com.Test.caching.repository;

import com.Test.caching.model.UserPayload;

import java.util.*;


public interface UserRepository {

    List<UserPayload> fetchAllUsers();

    UserPayload firstUser();

    UserPayload userByFirstNameAndLastName(String firstName,String lastName,Date date);

}
