package cn.andye.fragmenttabhost.save;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


//建立一个datebase数据库
public class phoneDB extends SQLiteOpenHelper {
    public static final String TABLE_NAME="phone";
    public static final String DATE="date";
    public static final String OPEN="open";
    public static final String CLOSE="close";
    public static final String ID="_id";
    public static final String DURING="during";
    public static final String STATION="station";


    //	数据库表文件名，版本号，只能升级不能降级
    public phoneDB(Context context) {
        super(context, "phone.db", null, 1);
    }

    //	只在软件第一次启动时创建
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (_id integer primary key autoincrement,date text not null,open text not null,close text not null,during text not null,station text not null)");
        //创建一个数据库类型，包含表名，id，内容，时间列

    }

    //数据库的升级
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

}