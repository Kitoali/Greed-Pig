import java.util.Scanner;
	/**
	*用户玩家类（人），包含人在进行游戏时适用的规则
	* */
	public class Player extends GamePlayer {
		/**	 * 初始条件：得分为0 ，状态为真（玩家先手） * */
		Player() 
		{
			score = 0;
			state = true;
		}
		/**
		 * 玩家进行游戏，当掷出1时不保留得分，返回为0。
		 * 当掷出[2,6]的整数，由玩家选择是否继续。
		 * 当玩家选择继续时，继续执行此方法。
		 * 直到当玩家选择不继续时，保留最后一次的得分并返回。
		 * */
		public void play()	
		{
			System.out.println("\n玩家扔");
			int currentScore = round();
			if (currentScore == 1) 
			{
				System.out.println("本轮没有得分");
			}
			else 
			{
				if (GoOn()) 
				{
					 play();
				}
				else
				{
					System.out.println("本次玩家点数" + currentScore);
					super.score +=  currentScore ;
					state = !state;
					return ;
				}
			} 
		}
		/**@return
		 * 根据用户输入的选择，判断是否需要进行游戏，并在输入错误时进行提醒。 */
		public static boolean GoOn()
		{
			System.out.println("请选择重新投色子（按r）;还是保留此次分数(按h)");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.next();
			if (choice.equals("r")) 
			{
				return true;
			} else if (choice.equals("h")) 
			{
				return false;
			}
			else
			{
				System.out.println("请输入正确的选择");
				return GoOn();
			}
		}
	}

