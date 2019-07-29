/*
 * MapConstants.java
 * v1.0
 * July 2019
 * Copyright ©2019 Footprnt Inc.
 */
package com.example.footprnt.Util;

/**
 * MapConstants used in application
 *
 * @author Clarisa Leu, Jocelyn Shen, Stanley
 */
public class AppConstants {
    // For Database:
    public static String POST_DB_NAME = "db_posts";

    // For getting attributes in database:
    public static String profileImage = "profileImg";
    public static String phone = "phone";
    public static String email = "email";
    public static String createdAt = "createdAt";
    public static String image = "image";
    public static String user = "user";
    public static String objectId = "objectId";
    public static String description = "description";
    public static final String location = "location";
    public static final String title = "title";
    public static final String country = "country";
    public static final String city = "city";
    public static final String continent = "continent";
    public static final String tags = "tags";
    public static final int postLimit = 20;

    // For getting extras for intents:
    public static String post = "Post";
    public static String position = "Position";

    // For passing data between fragments
    public static final String PREFERENCES = "MyPrefs" ;

    // For camera:
    public static String photoFileName = "photo.jpg";
    public static String fileProvider = "com.example.fileprovider";
    public static String profileImagePath = "profPic.jpg";  // Used in taking new profile picture
    public static String imagePath = "image.jpg";  // User in posting a new image
    public static int captureImageQuality = 100;

    // Request Codes User Throughout Application:
    public static final int SIGN_UP_ACTIVITY_REQUEST_CODE = 20;
    public static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1034;
    public static final int RELOAD_USERPROFILE_FRAGMENT_REQUEST_CODE = 2001;
    public static final int GET_FROM_GALLERY = 3;
    public static final int UPDATE_POST_FROM_PROFILE = 301;
    public static final int DELETE_POST_FROM_PROFILE = 302;

    // For Logcat:
    public static final String APP_TAG = "footprnt";

}