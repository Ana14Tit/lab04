package lab4;

public class Person {
int ID;
String name;
String gender;
Devision devision;
int salary;
String birthdate;
Person() {}
Person(int ID, String name, String gender, Devision devision, int salary, String birthdate)
{
	this.ID=ID;
	this.name=name;
	this.gender=gender;
	this.devision=devision;
	this.salary=salary;
	this.birthdate=birthdate;
}
public void setId(int ID){this.ID=ID;}
public int getId(){return ID;}

public void setName(String name) {this.name=name;}
public String getName(){return name;}

public void setGender(String gender) {this.gender=gender;}
public String getGender(){return gender;}

public void setDevision(Devision devision)
{
	this.devision = (Devision) devision.clone();
}
public Devision getDevision(){ return (Devision) devision.clone();}

public void setSalary(int salary){this.salary=salary;}
public int getSalary(){return salary;}

public void setBirthdate(String birthdate) {this.birthdate=birthdate;}
public String getBirthdate(){return birthdate;}
}