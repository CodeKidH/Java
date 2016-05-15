package module.socket;

public class QuizProtocol {
	
	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;
	
	private static final int NUMPROBLEMS = 3;
	
	private int state = WAITING;
	private int currentProblem = 0;
	
	private String[] problems = {"1+1=?","5+7=?","2+3=?"};
	
	private String[] answers = {"2","12","5"};
	
	public String process(String theInput){
		String theOutput = null;
		
		if(state == WAITING){
			theOutput = "Start Quiz(y/n)";
			state = PROBLEM;
		}else if(state == PROBLEM){
			if(theInput.equalsIgnoreCase("y")){
				theOutput = problems[currentProblem];
				state = ANSWER;
			}else{
				state = WAITING;
				theOutput = "quit";
			}
		}else if(state == ANSWER){
			if(theInput.equalsIgnoreCase(answers[currentProblem])){
				theOutput = "Bingo continue?(y/n)";
				state = PROBLEM;
			}else{
				state = PROBLEM;
				theOutput = "fail continue?(y/n)";
			}
			currentProblem = (currentProblem+1)%NUMPROBLEMS;
		}
		
		return theOutput;
	}
}
