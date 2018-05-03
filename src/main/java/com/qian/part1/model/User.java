package com.qian.part1.model;

import java.util.Date;

public class User {
	
	    private String name;  
	    private String birthday;  
	    private int age;  
	  

	    public User() {  
	        super();  
	    }  
	  
	    public User(String name, String birthday, int age) {  
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
	  
	    public String getBirthday() {  
	        return birthday;  
	    }  
	  
	    public void setBirthday(String birthday) {  
	        this.birthday = birthday;  
	    }  
	  
	    public int getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
}
