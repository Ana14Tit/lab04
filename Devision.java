package lab4;

public class Devision {
private int ID_d;
private String name_d;
Devision(){}
Devision(int ID_d, String name_d)
{
	this.ID_d=ID_d;
	this.name_d=name_d;
}
public void setId_d(int ID_d){this.ID_d=ID_d;}
public int getId_d() {return ID_d;}

public void setName_d(String name_d) {this.name_d=name_d;}
public String getName_d() {return name_d;}

public Object clone() {
    return new Devision(ID_d, name_d);
}
}
