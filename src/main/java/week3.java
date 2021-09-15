
public class week3 {
    //lab 3 class:create a method that takes a string and returns how many
    //Characters are there.
    //Csll this method and pass your name as an arguement.
    
    
    int getStrLngth(String name){
        int l= name.length();
        return l;}
    public static void main(String[] args){
        NewClass nc = new NewClass();
        String str= "Arielle Kann";
        int z= nc.getStrLngth(str);
        System.out.println("The length is " + z);
    }
    }
   