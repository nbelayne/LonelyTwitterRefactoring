package ca.ualberta.cs.lonelytweet;

import java.util.Date;

import ca.ualberta.cs.lonelytweet.LonelyTweet;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	private String getTweetBody() {  // changed the method access modifier to private (refactoring)
        return tweetBody;
    }
}