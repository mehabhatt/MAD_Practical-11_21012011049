package com.example.mad_practical_11_21012011049

class PersonTable {
    companion object{
        val TABLE_NAME= "Person"
        val COLUMN_ID ="Id"
        val COLUMN_NAME = "Name"
        val COLUMN_PHONE = "PhoneNo"
        val COLUMN_EMAIL = "Email"
        val COLUMN_ADDRESS = "Address"
        val COLUMN_GPS_LAT = "Latitude"
        val COLUMN_GPS_LONG = "Longitude"

        val CREATE_TABLE = ("CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_ID + " TEXT PRIMARY KEY," +
                COLUMN_NAME + " TEXT," +
                COLUMN_PHONE + " TEXT," +
                COLUMN_EMAIL + " TEXT," +
                COLUMN_ADDRESS + " TEXT," +
                COLUMN_GPS_LAT + " REAL," +
                COLUMN_GPS_LONG + " REAL" + ")")
    }
}