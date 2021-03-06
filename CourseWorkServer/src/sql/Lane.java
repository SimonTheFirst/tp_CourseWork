package sql;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lane 
{
	String name; //�������� ������ � ������� LANE_[0-1][0-9]
	int volume; //
	float occupancy; // ��������� � %
	float speed; // ��������
	float headway; // 
	float gap; // ���������� ����� ��������
	Date date; // ���� �������� ���������
	
	public Lane(String[] str) throws ParseException
	{
		name = str[1];
		volume = Integer.parseInt(str[2]);
		occupancy = Float.parseFloat(str[3]);
		speed = Float.parseFloat(str[4]);
		headway = Float.parseFloat(str[14]);
		gap = Float.parseFloat(str[15]);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd' 'hh:MM:ss");
		date = format.parse(str[16] +" "+ str[17]);	
	}
	
	public String getInsertQuery()
	{
		return "INSERT INTO" + " coursework.Lane" + "VALUES(" + 
				this.name  + "," + this.volume  + "," + this.occupancy + "," + 
				this.speed + "," + this.headway + "," + this.gap + "," + this.date +");";
	}
}
