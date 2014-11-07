package com.uttar.MyMenus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Actors {

	public static void main(String[] args) {

         Scanner sc1=new Scanner(System.in);
         Scanner sc2=new Scanner(System.in);
         int ch=0;String name;int age=0;
         List Actars=new ArrayList();

         while(ch!=5)
         {
        	 System.out.println("");
        	 System.out.println("Press 1 to add the  actors");
        	 System.out.println("Press 2 to list the  actors");
        	 System.out.println("Press 3 to remove an actor");
        	 System.out.println("Press 4 to containment oof an actor");
        	 System.out.println("Press 5  to Exit");
        	 ch=sc1.nextInt();
        	 System.out.println("");

        	 switch(ch)
             {
                case 1:System.out.println("Inside case 1");
                System.out.println("Enter the name of an actor");
                name=sc2.nextLine();
                System.out.println("Enter the Age of an actor");
                age=sc1.nextInt();

                Actor a=new Actor(name,age);
                Actars.add(a);
                System.out.println(Actars);
                break;

                case 2:System.out.println("Inside case 2");
                System.out.println("the list of Heroes with there age are"+Actars);
                break;
                
                case 3:System.out.println("Inside case 3");
                System.out.println("enter the name of actor to be removed");
                name=sc2.nextLine();
              List rem=new ArrayList();
            
             for(Object o:Actars)
                {
                	Actor a1 =(Actor)o;
                	
                        if(name.equals(a1.getName()))
                         rem.add(a1);
                        Actars.removeAll(rem);
                         System.out.println(Actars);
                         
                }
                case 4:System.out.println("inside case 4");
           	 System.out.println("enter the name of an actor to check containment ");
                name=sc2.nextLine();
           	 System.out.println("enter the age of an actor");
           	 age=sc1.nextInt();
                Actor con=new Actor(name,age);
           	 System.out.println("the actor" +name+ "is present in " +Actars+ " ? " +Actars.contains(con));
                
                 
                }
         }


	}

}




