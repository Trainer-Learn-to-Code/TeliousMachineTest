package test;

public class AddTable {
public AddTable() {
		super();
	}
int id;
String name,city,ctype;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public AddTable(int id, String name, String city, String ctype) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.ctype = ctype;
}


}
