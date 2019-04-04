package cn.andye.fragmenttabhost.save;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;


//建立一个datebase数据库，用来存储每天所得的分数
public class fractionDB extends SQLiteOpenHelper {
    public static final String TABLE_NAME="fraction";
    public static final String CONTENT="content";
    public static final String ID="_id";
    public static final String TIME="time";//日期
    public static final String PATH="path";

    //	数据库表文件名，版本号，只能升级不能降级
    public fractionDB(Context context) {
        super(context, "fraction.db", null, 1);
    }

    //	只在软件第一次启动时创建
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (_id integer primary key autoincrement,content text not null,time text not null)");
        //创建一个数据库类型，包含表名，id，内容，时间列

    }

    //数据库的升级
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

}