
	/**
	 * 由用户先开始游戏，则玩家的状态为“真”，即可以游戏，之后的每一次游戏中，机器和用户在完成掷骰子之后，将自己的状态置为“假”，即本回合结束。
	 * 同时，将对方的状态置为“真”，即对方的回合开始。 当其中一方的分数大于100时，结束循环，并报告获胜者。
	 * */
public class GreedyTest {
	public static void main(String[] args) 
	{
		Player player = new Player() ;
		Machine machine = new Machine() ;
		System.out.println("玩家先掷色子") ;
		while (player.getScore() < 100 && machine.getScore() < 100) 
		{
			if (player.getState())
			{
				player.play() ;
				machine.setState(true) ;
				System.out.println("玩家当前点数" + player.getScore()) ;
				if (player.score >= 100)	break ;
			}
			if (machine.getState()) 
			{
				machine.play() ;
				player.setState(true) ;
				System.out.println("机器当前点数" + machine.score) ;
			}
		}
		System.out.println(player.score >= 100 ? "玩家获胜" : "机器获胜") ;
	}
}
