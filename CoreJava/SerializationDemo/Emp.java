package com.pranay.SerializationDemo;

import java.io.Serializable;

public class Emp implements Serializable {
	public String firstName;
	public String lastName;
}
class EmpChild extends Emp {
	public String middleName;
}
