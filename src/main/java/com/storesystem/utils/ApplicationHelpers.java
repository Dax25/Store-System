/*
    This class acts as a helper class for the application.
    It provides static data members that are used to store
    current logged in user information as a session to 
    maintain the integrity of the application
*/

package com.storesystem.utils;

import com.storesystem.persistence.model.ItemEntity;
import java.util.ArrayList;
import java.util.List;

public class ApplicationHelpers {
    
    // Static member to store logged in user account type
    public static boolean isAdmin = false;
    
    // Static member to store logged in user username
    public static String username;
    
    // Static member to store the items that are added in the cart to purchase
    public static List<ItemEntity> orderedItems = new ArrayList<>();
    
    // Static member to store the months list
    public static String [] months = {
        "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"
    };
}