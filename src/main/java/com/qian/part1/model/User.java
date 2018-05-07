package com.qian.part1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	    @Id()
	    private String name;  
	    private String birthday;  
	    private int age;  
	  

	    protected User() {  
	       
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
	    
	    @Override
	    public String toString() {
	        return String.format(
	                "User[name='%s', birthday='%s',age=%d]",
	                name, birthday, age);
	    }
}
