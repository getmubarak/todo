package problem1;

class InvalidStateException extends Exception{
}

interface State
{
	void start();
	void stop();
	void pause();
	void resume();
}
class Idle implements State
{
	public void start() { 
		//logic
	}
	void stop(){
		throws new InvalidStateException();
	}
	void pause(){
		throws new InvalidStateException();
	}
	void resume(){
		throws new InvalidStateException();
	}
}
class Running implements State
{
	public void start(){
		throws new InvalidStateException();
	}
	void stop(){
		//logic
	}
	void pause(){
		//logic
	}
	void resume(){
		throws new InvalidStateException();
	}
}
class Suspended implements State
{
	public void start() { 
		throws new InvalidStateException();
	}
	void stop(){
		//logic
	}
	void pause(){
		throws new InvalidStateException();
	}
	void resume(){
		//logic
	}
}
public class StopWatch {
	State state = new Idle();
	public void start(){
		state.start();
		state = new Running();
	}
	public boolean stop(){
		state.stop();
		state = new Idle();
	}
	public boolean pause(){
		state.pause();
		state = new Suspended();
	}
	public boolean resume(){
		state.resume();
		state = new Running();
	}
}
