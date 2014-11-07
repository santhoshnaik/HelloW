package com.uttar.MyMenus;

public class Actor  {
	String name;
	int age;
	
	
	public Actor(String s,int n)
	{
		name=s;
		age=n;
	}
	public  String getName() {
		return name;
	}
	public int getAge(){
		return age;

    }
	/*public int hashCode(){
		return (name+age).hashCode();
	}*/
public String toString(){
		
		return name+" "+age;
	}
	public boolean equals(Object o){
		if(o instanceof Actor )
		{
			Actor e =(Actor)o;
			if(this.name.equals(e.name)&&this.age==(e.age))
				return true;
			else
				return false;
			
		}
		else
			throw new IllegalArgumentException("name and age cannot be a null and zero");
				
	}
	
	public int compareTo(Object o){
		if(o instanceof Actor)
		{
			 Actor g = (Actor) o;
				return this.name.compareTo(g.name);
		}
		else
			throw new IllegalArgumentException("name cannot be null"); 
		
		
	}
			
}

