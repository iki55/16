package proekt_22;

public class Car {
private String make, model;
private int year;
 Car(){
	make="Unknown";
	model="Unknown";
	year=2014;
}
Car(String m , String m1, int y)
{
	this.make=m;
	this.model=m1;
	this.year=y;
	}
public String toString() {
	return make + '\'' + model + '\''+ year ;
	
}
}
