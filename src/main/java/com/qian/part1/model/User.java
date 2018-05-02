package com.qian.part1.model;

import java.util.Date;

public class User {
	
	    private String name;  
	    private Date birthday;  
	    private int age;  
	  

	    public User() {  
	        super();  
	    }  
	  
	    public User(String name, Date birthday, int age) {  
	        super();  
	        this.name = name;  
	        this.birthday = birthday;  
	        this.age = age;  
	    }  
	  
	    // getter & setter  
	 
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public Date getBirthday() {  
	        return birthday;  
	    }  
	  
	    public void setBirthday(Date birthday) {  
	        this.birthday = birthday;  
	    }  
	  
	    public int getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
}
