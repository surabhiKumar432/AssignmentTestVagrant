package assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Playlist {

	public static void main(String[] args) {

		HelperFunctions obj = new HelperFunctions();
		Scanner sc= new Scanner(System.in); 

		/** Enter number of users **/   
		System.out.println("Enter the number of users - ");  
		int noOfUsers= sc.nextInt(); 

		/** Enter initial capacity of the system **/
		System.out.println("Enter the initial capacity of the system - ");  
		int initialCapacity= sc.nextInt();

		/** Create a map of user-song list **/
		Map<String, String[]> hashMap = new HashMap<String, String[]>();
		obj.createUserSonglistMapping(hashMap, noOfUsers, initialCapacity);

		/** Create new playlist of recently played songs **/
		int editPlaylist=0;
		while(editPlaylist==0) {
		obj.userNewPlaylist(hashMap);
		System.out.println("Do you want to continue with another User? - Y/N"); 
		if( sc.next().equalsIgnoreCase("Y")) continue;
		else editPlaylist=1;
		}
		
		/** View all user playlist **/
		obj.viewAllUserPlaylist(hashMap);
		
	}

}
