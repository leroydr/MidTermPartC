/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author drake
 */
public class TestUserProfile {
    
    public static void main(String[]args){
        UserProfile user1 = new UserProfile(null, null);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter you're name: ");
        user1.setUserID(sc.nextLine());
        
        user1.printG();
        System.out.println("Please pick one of these genres: ");
        user1.setGenre(sc.nextLine());
        
        System.out.println("New User created with UserID: "
        + user1.getUserID() + " and favourite Genre: " + user1.getGenre());
        
    }
           
            
            
}
