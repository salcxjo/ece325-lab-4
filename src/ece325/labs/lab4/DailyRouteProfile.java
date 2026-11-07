package ece325.labs.lab4;

import java.util.ArrayList;
import java.util.Collections;


public class DailyRouteProfile implements Comparable<DailyRouteProfile> {
    private String category;
    private ArrayList<String> routes;
    private double initialFare;
    private double averageFare;
    private int recordCount;

    public DailyRouteProfile(String category, ArrayList<String> routes, double initialFare) {
    	this.category = category;
    	this.routes = routes;
    	this.initialFare = initialFare;
    	this.averageFare = initialFare;
    	this.recordCount = 1;

    }

	/**
	 * Parse a DailyRouteProfile object from the String and return it. If the String
	 * cannot be parsed into an DailyRouteProfile object
	 *
	 * @param lines - string collection of the daily route travel patterns
	 * @return a collection of daily route travel pattern objects.
	 */
	public static ArrayList<DailyRouteProfile> parseRouteProfiles(ArrayList<String> lines) {

		// TODO: Implement your code here.
	}

	/**
	 * Recomputes the average fare taking the new fare into account.
	 * @param fare - the new fare.
	 */
	public void addFareRecord(double fare) {
		// TODO: Implement your code here.
	}

	public String getCategory() {
        return category;
    }

    public double getInitialFare() {
		return initialFare;
	}

	public double getAverageFare() {
        return this.averageFare;
    }

	public ArrayList<String> getRoutes() {
        return routes;
    }

	/**
	 * Returns true if two daily travel route patterns are the same.
	 * Note that you don't have to include the average fare in this comparison (as it is not really related to the equality of the travel route pattern).
	 */
    @Override
    public boolean equals(Object obj) {
    	// TODO: Write your code here
    }

    @Override
    public String toString() {
        return category + "; " + routes.toString() + "; " + String.format("%.2f", getAverageFare());
    }

    /**
     * Natural ordering: compare passenger categories alphabetically, then route lists lexicographically.
     * Sort the routes alphabetically within each list before comparing.
     *
     * Returns a negative integer, zero, or a positive integer if this object is less than,
     * equal to, or greater than the other object.
     * See the assignment description for more details.
     */
    @Override
    public int compareTo(DailyRouteProfile other) {
    	// TODO: Write your code here
    }

    /**
     * Return the hash code of the object. Note that the hash code of two equal objects must be the same.
     */
    @Override
    public int hashCode() {
    	// TODO: Write your code here
    }
}
