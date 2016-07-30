package bonanc.stingapp.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Caobonan on 11/12/15.
 */
public class DatabaseOps {

    // database name
    private static final String DATABASE_NAME = "MAILDB";
    private static final String CREATE_DB = "CREATE TABLE IF NOT EXISTS MAILLIST " +
            "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "FIRSTNAME VARCHAR[127] NOT NULL, " +
            "LASTNAME VARCHAR[127] NOT NULL, " +
            "EMAIL VARCHAR[127] NOT NULL);";
    private SQLiteDatabase database; // database object
    private DatabaseOpenHelper databaseOpenHelper; // database helper

    // public constructor for DatabaseOps
    public DatabaseOps(Context context)
    {
        // create a new DatabaseOpenHelper
        databaseOpenHelper =
                new DatabaseOpenHelper(context, DATABASE_NAME, null, 1);
    } // end DatabaseOps constructor

    // open the database connection
    public void open() throws SQLException
    {
        // create or open a database for reading/writing
        database = databaseOpenHelper.getWritableDatabase();
    } // end method open

    // close the database connection
    public void close()
    {
        if (database != null)
            database.close(); // close the database connection
    } // end method close

    // inserts a new student in the database
    public void insertData(String firstName, String lastName, String email)
    {
        ContentValues newFan = new ContentValues();
        newFan.put("FIRSTNAME", firstName);
        newFan.put("LASTNAME", lastName);
        newFan.put("EMAIL", email);
        open(); // open the database
        long id = database.insert("MAILLIST", "ID", newFan);
        String query = "SELECT * FROM MAILLIST";
        Cursor c = database.rawQuery(query, null);
        if (c != null && c.moveToFirst()) {
            while (!c.isLast()) {
                c.moveToNext();
            }
            String s = c.getString(c.getColumnIndex("EMAIL"));
            Log.i("DB", s);

        }
        close(); // close the database
    } // end method insertData


    private class DatabaseOpenHelper extends SQLiteOpenHelper
    {
        // public constructor
        public DatabaseOpenHelper(Context context, String name,
                                  SQLiteDatabase.CursorFactory factory, int version)
        {
            super(context, name, factory, version);
        } // end DatabaseOpenHelper constructor

        // creates the contacts table when the database is created
        @Override
        public void onCreate(SQLiteDatabase db)
        {
            // query to create a new table named SCOREDATA
            db.execSQL(CREATE_DB); // execute the query
        } // end method onCreate

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion)
        {
        } // end method onUpgrade
    } // end class DatabaseOpenHelper
}
