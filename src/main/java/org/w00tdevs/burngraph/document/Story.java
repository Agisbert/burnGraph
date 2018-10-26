package org.w00tdevs.burngraph.document;

/**
 * @author agisbert
 *
 */
public class Story {

	private String title;
	
	private Risk risk;
	
	private FibonacciSeq estimate;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public FibonacciSeq getEstimate() {
		return estimate;
	}

	public void setEstimate(FibonacciSeq estimate) {
		this.estimate = estimate;
	}

	
	
}
