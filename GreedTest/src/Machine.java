
public class Machine extends GamePlayer 
{
	/** 初始条件：得分为0，状态为假（机器后手） */
	Machine()
	{
		score = 0 ;
		state = false ;
	}
	/* *  掷出[2,6]的整数时，将得分累加。
	 * 在本轮得分大于20时，返回本轮得分。 */
	public void play() 
	{
		System.out.println("\n机器扔") ;
		int current = round() ;
		int totalScore = 0 ;
		while (current != 1 && totalScore < 20)
		{
			totalScore += current ;
			current = round() ;
		}
		if (current == 1)
		{
			System.out.println("本轮没有得分") ;
			state = !state ;
			return ;
		}
		else if (totalScore >= 20) 
		{
			System.out.println("本轮得分" + totalScore) ;
			super.score += totalScore ;
			state = !state ;
		} 
	}
}

