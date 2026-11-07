package ece325.labs.lab4;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TransitApp {
	
	public static void main(String[] args) {
        
		TravelPatternCollection collection = new TravelPatternCollection();
		try {
			ArrayList<String> lines = TransitLoaderAudit.loadData("tap_summary.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (line : lines)
			{
			ArrayList<DailyRouteProfile> line = [];
			line.getName().append(DailyRouteProfile.parseRouteProfiles(line));
			}
			
			
		TravelPatternCollection.processRouteProfile(line)
		
        
		// 2. TODO: Load tap summary transit data from file
				
		// 3. TODO: Parse daily tap summary transit data into DailyRouteProfile objects
		        
		// 4. TODO: Process the daily routes patterns to determine the average fare for each travel pattern
		     
        // 5. TODO Display natural ordering (Category, then Routes)

        // 6. TODO Display alternative ordering (Routes, then Category)
		
		// 7. TODO Demonstrate hashSet
    }

}
