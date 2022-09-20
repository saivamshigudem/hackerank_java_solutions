import java.io.*;
import java.util.*;



class Sports{
    String getName(){
       return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " +  getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        
       return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
    
}
public class Override {

    public static void main(String[] args) {
        Soccer obj = new Soccer();
        Sports obj1 = new Sports();
         String b= obj1.getName();
        System.out.println(b);
        obj1.getNumberOfTeamMembers();
        
        
        String a= obj.getName();
        System.out.println(a);
        obj.getNumberOfTeamMembers();
    }
}
