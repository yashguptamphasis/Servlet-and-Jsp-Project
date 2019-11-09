package com.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	static Connection getCon()
	{
		Connection con=null;
		System.out.println("reached connection ");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/db","root","root");
			
			} 
			catch (ClassNotFoundException e) {e.printStackTrace();} catch (SQLException e) {e.printStackTrace();}  
		//System.out.println("after save");
		return con;
	}
	int save(Student s)
	{
		System.out.println("inside save");
		Connection con=StudentDao.getCon();
		int i=0;
		try {
			PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?,?)");
			stmt.setString(1,s.getName());
			stmt.setString(2,s.getEmail());
			stmt.setString(3,s.getPass());
			stmt.setString(4,s.getCountry());
			
			i=stmt.executeUpdate();
			} catch (SQLException e) {e.printStackTrace();}
		return i;
	}
	List<Student> getStudent() 
	{
		List<Student> list= new ArrayList<Student>();
		
		Connection con=StudentDao.getCon();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("select * from students");
		 
	
		
			ResultSet rs;
			rs = pst.executeQuery();
		
			while(rs.next())
			{	Student s= new Student();
				s.setName(rs.getString(1));
				s.setEmail(rs.getString(2));
				s.setPass(rs.getString(3));
				s.setCountry(rs.getString(4));
				list.add(s);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list returned");
		return list;
		
	}
	
}
