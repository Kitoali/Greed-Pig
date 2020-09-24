
public class GamePlayer {
	/** 玩家得分 **/
	protected int score ;
	/** 是否为本玩家的回合 **/
	protected boolean state ;
	/** 
	 * @return 返回得分score
	 **/
	public int getScore() 
	{
		return score ;
	}
	/**@return
	 * 返回当前玩家状态state，
	 * 真为其回合，假为对方回合**/
	public boolean getState() 
	{
		return state ;
	}

	/**
	 * 设置玩家状态
	 * @param state
	 * 玩家状态 
	 */
	public void setState(boolean state) 
	{
		this.state = state ;
	}
	/** @return currentScore
	 * 返回当前分数
	 * 掷骰子，每次返回一个[1,6]的整数 */
	protected int round() 
	{
		int currentScore = (int) (Math.random() * 6 + 1) ;
		System.out.println("本轮点数：" + currentScore) ;
		return currentScore ;
	}
	/**游戏规则，在子类中实现*/
	protected void play ()
	{}

}
