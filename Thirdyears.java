/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nancie;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author shockwave
 */
public class Thirdyears {
    
    public static void main(String[] args)
    {
        
        Hashtable<String,Hashtable<String,Integer>> members=new Hashtable<String,Hashtable<String,Integer>>();
        System.out.println("Jamii management system");
        while(true)
        {
            System.out.println("Please enter i=>insert r=>remove,v=>viwe and t=>iterate hashtable for updates");
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
            
            switch(str)
            {
                case "i":
                    System.out.println("INSERT NEW MEMBERS");
                    while(true)
                    {
                        System.out.println("INsert name or q to quit");
                        Scanner sc2=new Scanner(System.in);
                        String name=sc2.nextLine();
                        if(name.equalsIgnoreCase("q"))
                        {
                            break;
                        }
                        System.out.println("Enter category");
                        String cat=sc2.nextLine();
                        
                        System.out.println("Enter amount");
                        int amount=sc2.nextInt();
                        Hashtable<String,Integer> memdata=new Hashtable<String,Integer>();

                        memdata.put(cat,amount);
                        //overrall hashtable
                        members.put(name,memdata);
                        
                    }
                break;
                
                case "v":
                    System.out.println(members);
                    break;
                    
                case "r":
                    while(true)
                    {
                        System.out.println("Enter name to delete or q to quit");
                        Scanner sc2=new Scanner(System.in);
                        String name=sc2.nextLine();
                        if(name.equalsIgnoreCase("q"))
                        {
                            break;
                        }
                        //check key if it exists
                        if(members.containsKey(name))
                        {
                        members.remove(name);
                        System.out.println(name+ " Has been removed");
                        }
                        else
                        {
                            System.out.println(name+" does not exist in the table");
                        }
                    }
                    break;
                    
                case "t":
                    while(true)
                    {
                        System.out.println("Enter name to update record q=>quit");
                        Scanner sc2=new Scanner(System.in);
                        String name=sc2.nextLine();
                          if(name.equalsIgnoreCase("q"))
                        {
                            break;
                        }
                        //check key if it exists
                        if(members.containsKey(name))
                        {
                          //
                            System.out.println("Enter category ");
                            
                            String cat=sc2.nextLine();
                            
                            
                            System.out.println("Enter amount ");
                            
                            int amount=sc2.nextInt();
                            members.get(name).put(cat,members.get(name).get(cat)+amount);
                                    
                        
                        }
                      else
                        {
                            
                        }
                        
                    }
                default:
                    System.out.println("Incorrect input. Please enter i=>insert r=>remove,v=>viwe and a to iterate hashtable for updates");
                    break;
            }
            
        }
    }
    
}
