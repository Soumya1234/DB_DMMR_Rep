package Code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Support.Messages;

public class prepare 
{
   public static void execute(Connection con) throws SQLException
   {
	    Statement myStat;
		myStat = con.createStatement();
		myStat.executeUpdate("CREATE DATABASE METER_MOVEMENT");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.VENDOR(VENDOR_CODE int,VENDOR_NAME varchar(255),VENDOR_TYPE varchar(255),VENDOR_ADDRESS varchar(255),VENDOR_PIN varchar(255),MOB_NO varchar(255),VENDOR_EMAIL varchar(255),primary key(VENDOR_CODE))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.ISSUE(METER_NO varchar(255),METER_PHASE varchar(12),ISSUE_DATE datetime,VENDOR_CODE int,WO_NO varchar(255),WO_DATE datetime,PURPOSE varchar(255))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.RECEIVE(METER_NO varchar(255),METER_PHASE varchar(12),RECEIVE_DATE datetime,VENDOR_CODE int,ERP_REF_NO varchar(255),WO_NO varchar(255),WO_DATE varchar(255),primary key(METER_NO))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.STOCK(METER_NO varchar(255),METER_PHASE varchar(12),RECEIVED_BY int,primary key(METER_NO))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.UTILIZATION(METER_NO varchar(255),METER_PHASE varchar(12),CON_ID VARCHAR(255),VENDOR_CODE int,UTIL_DATE datetime,PURPOSE varchar(255))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.RETUR_N(METER_NO varchar(255),METER_PHASE varchar(255),RETURNED_BY int,WO_NO varchar(255),WO_DATE datetime,RETURN_DATE datetime,PURPOSE varchar(255))");
	    myStat.executeUpdate("CREATE TABLE METER_MOVEMENT.RECEIVE_UTILIZED(METER_NO varchar(255),METER_PHASE varchar(255),RECEIVED_BY int,RECEIVE_DATE datetime)");
	    myStat.executeUpdate("create table METER_MOVEMENT.METER_REP_DATA (CON_REF varchar(255),CON_NAME varchar(255),OLD_MET_NO varchar(255),FINAL_READING varchar(255),OLD_MET_PHASE varchar(255),REP_DATE datetime,NEW_MET_NO varchar(255),NEW_MET_INIT_READING varchar(255),NEW_MET_PHASE varchar(255),VENDOR_CODE int,REP_PURPOSE varchar(255),REMOVE_REASON varchar(255),DEV_CAT varchar(255),MR_NOTE varchar(255),SEAL1 varchar(255),SEAL2 varchar(255),SEAL3 varchar(255))");
	    myStat.executeUpdate("CREATE table METER_MOVEMENT.USER_DATA(USER_ID int,USERNAME varchar(255),LOGIN_PASSWORD varchar(255),PERMISSION_LEVEL int,PRIMARY KEY(USER_ID))");
	    
	} 
}
