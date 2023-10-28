package com.example.mad_practical_11_21012011049

class DatabaseHelper (context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, class [patabfactory: null, DATABASE_VERSION) {
        2 hitsofttech
                companion object {
            // Database Version
            private const val DATABASE_VERSION = 1
            // Database Name
            private const val DATABASE_NAME = "persons_db"
        }
// Creating Tables
        2 hitsofttech
                override fun onCreate(db: SQLiteDatabase) {
// create persons table
            db.execSQL(PersonDbTableData.CREATE_TABLE)
}