/*
    This is an enum class that is used within the application
    to send/receive application messages. It contains all the 
    response messages that are passed from the persistence layer
    to the presentation layer about the status of database transaction.
*/

package com.storesystem.utils;


public enum ApplicationMessages {
    INVALID_USERNAME,
    INVALID_PASSWORD,
    SUCCESSFUL_LOGIN,
    DATA_ADDED,
    SAVE_ERROR,
    DATA_UPDATED,
    DATA_DELETED,
    DELETE_ERROR,
    UPDATE_ERROR
}
