package assignment;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;


public class HelperFunctions {

	Scanner sc= new Scanner(System.in); 
	String[] arr =  null;

	public Map<String, String[]> createUserSonglistMapping(Map<String, String[]> map, int noOfUsers,int initialCapacity ) {

		for(int i=1;i<=noOfUsers;i++) {
			System.out.println("Enter the username : "); 
			String username = sc.next();
			String[] songList = new String[initialCapacity];
			for(int j=0;j<initialCapacity;j++) {
				System.out.println("Enter SongNo"+(j+1)+" played by the User"+(i)+" - ");  
				songList[j] = sc.next();
			}
			map.put(username, songList);
		}
		return map;
	}

	public Map<String, String[]> userNewPlaylist(Map<String, String[]> map) {

		
		String user = null;
		while(arr== null) {
			System.out.println("Please enter valid user to fetch recently played songs : "); 
			user  = sc.next();
			for (Map.Entry<String,String[]> entry : map.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(user))
					arr =  entry.getValue();
			}
		}

		System.out.println("Enter the next song played by the user"); 
		String songPlayed =  sc.next();

		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]= songPlayed;
		System.out.println(user+" : "+Arrays.toString(arr));
		return map;

	}

	public void viewAllUserPlaylist(Map<String, String[]> map) {
		for (Map.Entry<String,String[]> entry : map.entrySet()) {
			arr =  entry.getValue();
			System.out.println(entry.getKey()+" : "+Arrays.toString(arr));

		}
	}



}
