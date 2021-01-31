import java.util.Random;

public class FortuneCookie extends Object implements ISurprise{
	
	private String messageOfCookie;
	private static final Random random = new Random();
	private static final String[] messages = {
			"Do not be afraid of competition."
			, "An exciting opportunity lies ahead of you."
			, "You love peace."
			, "Get your mind set…confidence will lead you on."
			,"You will always be surrounded by true friends."
			,"Sell your ideas-they have exceptional merit."
			,"You should be able to undertake and complete anything."
			,"You are kind and friendly."
			,"You are wise beyond your years."
			,"Your ability to juggle many tasks will take you far."
			,"A routine task will turn into an enchanting adventure."
			,"Beware of all enterprises that require new clothes."
			,"Be true to your work, your word, and your friend."
			,"Goodness is the only investment that never fails."
			,"A journey of a thousand miles begins with a single step."
			,"Forget injuries; never forget kindnesses."
			,"Respect yourself and others will respect you."
			,"A man cannot be comfortable without his own approval."
			,"Always do right. This will gratify some people and astonish the rest."
			,"It is easier to stay out than to get out."
			,"Sing everyday and chase the mean blues away."
			,"You will receive money from an unexpected source."
			,"Attitude is a little thing that makes a big difference."
			,"Plan for many pleasures ahead."
			,"Experience is the best teacher."
			,"You will be happy with your spouse."
			,"Expect the unexpected."
			,"Stay healthy. Walk a mile."
			,"The family that plays together stays together."
			,"Eat chocolate to have a sweeter life."
			};
	private static final String[] authors = {
			"A","B","C","D","E","F","G","H","I","J","K","L","M","N","A","B","C","D","E","F","G","H","I","J","K","L","A","B","C","D"};
	
	
	public FortuneCookie() {
		this.messageOfCookie = generate();
	}

	private static String generate() {
		
		int a = random.nextInt(30);
		return messages[a] + " - '" + authors[a] +"'";
	}
	
	public String getMessageOfCookie() {
		return this.messageOfCookie;
	}

	@Override
	public String toString() {
		return "The message of the cookie is : " + this.messageOfCookie;
	}

	@Override
	public void enjoy() {
		//impl
		
	}


}
