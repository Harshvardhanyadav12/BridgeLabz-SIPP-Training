package com.bridgelaz;

public class LibraryDemo {
    void department(){
        System.out.println("Department");
    }

}
public class ID extends LibraryDemo{
    void detail(){
        System.out.println("information ID");
    }
}
public class Main{
    public static void main(String [] args){
        ID id= new ID();
        id.detail();    
        id.department();
}
}