import java.awt.*;

import javax.swing.*;
import java.util.*;
import java.util.*;

public class Events {
	private String name, subject;
	private int date, month;
	public ArrayList<Events> eventsList = new ArrayList<Events>();

	public Events(String eventName, int date1, int month1) {
		name = eventName;
		date = date1;
		month = month1;
		addToArray(this);
	}
	public Events(String eventName) {
		name = eventName;
		addToArray(this);
	}
	public Events(String eventName, String subj) {
		name = eventName;
		subject = subj;
		addToArray(this);
	}
	public Events(String eventName, int date1, int month1, String subj) {
		name = eventName;
		date = date1;
		month = month1;
		subject = subj;
		addToArray(this);
	}
	
	public void addToArray(Events e) {
		eventsList.add(e);
	}
	public int getDate() {
		return date;
	}
	public int getMonth() {
		return month;
	}
	public String getName() {
		return name;
	}
	public String getSubj() {
		return subject;
	}
	public void setDate(int dat) {
		date = dat;
	}
	public void setMonth(int mon) {
		month = mon;
	}
	public void setName(String nam) {
		name = nam;
	}

}
