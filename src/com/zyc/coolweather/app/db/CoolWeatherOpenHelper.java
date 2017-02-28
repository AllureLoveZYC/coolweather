package com.zyc.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	
	/**
	 * @param provice 表建表语句
	 */
	private static final String create_provice ="create table province (" +
			" id integer primary key autoincrement" +
			" province_name text " +
			" province_code text " +
			")";
	/**
	 * @param city 表建表语句
	 */
	private static final String create_city ="create table city (" +
			" id integer primary key autoincrement" +
			" city_name text " +
			" city_code text " +
			" province_id  integer" +
			")";
	/**
	 * @param country 表建表语句
	 */
	private static final String create_country ="create table country (" +
			" id integer primary key autoincrement" +
			" country_name text " +
			" country_code text " +
			" city_id  integer" +
			")";
	
	
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_provice);
        db.execSQL(create_city);
        db.execSQL(create_country);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
