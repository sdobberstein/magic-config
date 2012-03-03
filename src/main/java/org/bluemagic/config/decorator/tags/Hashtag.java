package org.bluemagic.config.decorator.tags;

/**
 * Implements the common hashtags found on Twitter
 * For example #RockyRoadIceCream or #test 
 * 
 * For more info:
 * https://support.twitter.com/groups/31-twitter-basics/topics/109-tweets-messages/articles/49309-what-are-hashtags-symbols
 */
public class Hashtag extends SingleTag {

	private static final String HASHTAG_PREFIX = "#";

	public Hashtag() { 
		this.prefix = HASHTAG_PREFIX;
	}
	
	public Hashtag(String value) {
		this.prefix = HASHTAG_PREFIX;
		this.value = value;
	}
	
	public Hashtag(String prefix, String value, String suffix) {

		setPrefix(prefix);
		this.value = value;
		setSuffix(suffix);
	}
	
	@Override
	public void setPrefix(String prefix) {
		
		if ((prefix != null) && (prefix.startsWith(HASHTAG_PREFIX))) {			
			this.prefix = prefix;
		} else {
			this.prefix = HASHTAG_PREFIX + prefix;
		}
	}
}
