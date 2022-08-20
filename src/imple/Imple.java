package imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.Dbcon;
import bean.Ownerbean;
import bean.Uploadbean;
import bean.Userbean;
import inter.Inter;

public class Imple implements Inter {

	Connection con;
	public int oreg(Ownerbean owr) {
		int sk=0;
		try{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO secure.owner VALUES(?,?,?,?,?)");
		    ps.setString(1, owr.getName());
		    ps.setString(2, owr.getEmail());
		    ps.setString(3, owr.getNumber());
		    ps.setString(4, owr.getPass());
		    ps.setString(5, owr.getConpass());
		    sk=ps.executeUpdate();	
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return sk;
	}

	@Override
	public boolean olog(Ownerbean owl) {
		boolean ks=false;
		try
		{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM secure.owner where email=? and pass=?");
			ps.setString(1, owl.getEmail());
			ps.setString(2, owl.getPass());			
			ResultSet rs=ps.executeQuery();
			ks=rs.next();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ks;
	}

	@Override
	public int ureg(Userbean usr) {
		int sk=0;
		try{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO secure.userr VALUES(?,?,?,?,?)");
		    ps.setString(1, usr.getName());
		    ps.setString(2, usr.getEmail());
		    ps.setString(3, usr.getNumber());
		    ps.setString(4, usr.getPass());
		    ps.setString(5, usr.getCpass());
		  
		    sk=ps.executeUpdate();	
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return sk;
	}

	@Override
	public boolean ulog(Userbean usl) {
		boolean ks=false;
		try
		{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM secure.userr where email=? and pass=?");
			ps.setString(1, usl.getEmail());
			ps.setString(2, usl.getPass());			
			ResultSet rs=ps.executeQuery();
			ks=rs.next();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ks;
	}

	@Override
	public int file(Uploadbean upb) {
		int dd=0;
		try{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO secure.fileupload  VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1,upb.getFilename());
			ps.setString(2,upb.getFiletype());
			ps.setString(3,upb.getFilesize());
			ps.setString(4,upb.getFilecontent());
			ps.setString(5,upb.getEncrypt());
			ps.setString(6,upb.getDecrypt());
			ps.setString(7,upb.getEmail());
			ps.setString(8,upb.getFilekey());
			
			
			dd=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
			return dd;
	}

	@Override
	public int key(Uploadbean upk) {
		int dd=0;
		try
		{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO `secure`.`filekey` VALUES(id,?,?)");
			ps.setString(1,upk.getFilekey());
			ps.setString(2,upk.getEmail());
	
			dd=ps.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return dd;
	}

	@Override
	public int req(Uploadbean rqb) {
		int r=0;
		try
		{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO secure.request VALUES(?,?,?,?,?)");
			ps.setString(1,rqb.getOwner());
			ps.setString(2,rqb.getUser());
			ps.setString(3,rqb.getFilename());
			ps.setString(4,rqb.getFilekey());
			ps.setString(5,"Request");
			
			r=ps.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return r;
	}

	@Override
	public int rep(Uploadbean rpb) {
		int r=0;
		try
		{
			con=Dbcon.CreateConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO secure.response VALUES(?,?,?,?,?)");
			ps.setString(1,rpb.getOwner());
			ps.setString(2,rpb.getUser());
			ps.setString(3,rpb.getFilename());
			ps.setString(4,rpb.getFilekey());
			ps.setString(5,"Accept");
	
			r=ps.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return r;
	}


	

}
